package com.extazy.backend.service;

import com.extazy.backend.entity.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class ResultService {
    private final EventService eventService;
    private final ObjectMapper objectMapper;
    private final Map<String, Class<?>> resultTypeMap;

    public ResultService(EventService eventService, ObjectMapper objectMapper) {
        this.eventService = eventService;
        this.objectMapper = objectMapper;
        this.resultTypeMap = new HashMap<>();
        initializeResultTypeMap();
    }

    private void initializeResultTypeMap() {
        // 初始化映射，根据实际情况填充
        resultTypeMap.put("sw", SwimmingResult.class);
        resultTypeMap.put("wp", WaterPoloResult.class);
        resultTypeMap.put("sv", SynchronizedSwimmingResult.class);
        resultTypeMap.put("hd", HighDivingResult.class);
        resultTypeMap.put("dv", DivingResult.class);
        resultTypeMap.put("ow", OpenWaterResult.class);
    }

    public <T> List<T> fetchResults(String disciplineName) {
        List<DisciplineInfo> disciplineInfos = eventService.fetchDisciplines();

        Optional<DisciplineInfo> disciplineInfoOptional = disciplineInfos.stream()
                .filter(disciplineInfo -> disciplineInfo.getName().equalsIgnoreCase(disciplineName))
                .findFirst();

        if (disciplineInfoOptional.isPresent()) {
            DisciplineInfo disciplineInfo = disciplineInfoOptional.get();
            String disciplineId = disciplineInfo.getId();
            String disciplineCode = disciplineInfo.getCode();

            String baseUrl = "https://api.worldaquatics.com/fina/events/";
            String finalUrl = baseUrl + disciplineId;
            RestTemplate restTemplate = new RestTemplate();

            ResponseEntity<String> response = restTemplate.getForEntity(finalUrl, String.class);
            String json = response.getBody();

            Class<?> resultClass = resultTypeMap.get(disciplineCode.toLowerCase());
            //System.out.println(resultClass.getName());
            if (resultClass == null) {
                System.out.println("Unsupported discipline code: " + disciplineCode);
                return new ArrayList<>();
            }

            try {
                if (json.startsWith("[")) {
                    // JSON为数组
                    return objectMapper.readValue(json, objectMapper.getTypeFactory().constructCollectionType(List.class, resultClass));
                } else {
                    // JSON为单个对象
                    T result = objectMapper.readValue(json, (Class<T>) resultClass);
                    return Collections.singletonList(result);
                }
            } catch (Exception e) {
                e.printStackTrace();
                return new ArrayList<>();
            }
        } else {
            System.out.println("No discipline found with the name: " + disciplineName);
            return new ArrayList<>();
        }
    }
}

