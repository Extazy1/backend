package com.extazy.backend.service;

import com.extazy.backend.entity.DisciplineInfo;
import com.extazy.backend.entity.Event;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class EventService {

    public List<Event> fetchEvents() {
        String baseUrl = "https://api.worldaquatics.com/fina/competitions/2969/events";
        RestTemplate restTemplate = new RestTemplate();
        try {
            // 尝试将响应解析为Event对象的数组
            Event[] eventsArray = restTemplate.getForObject(baseUrl, Event[].class);
            return Arrays.asList(eventsArray);
        } catch (Exception e) {
            // 处理单个Event对象的情况
            try {
                Event singleEvent = restTemplate.getForObject(baseUrl, Event.class);
                return Collections.singletonList(singleEvent);
            } catch (Exception ex) {
                // 处理错误或返回空列表
                ex.printStackTrace();
                return Collections.emptyList();
            }
        }
    }


    public List<DisciplineInfo> fetchDisciplines() {
        List<Event> events = this.fetchEvents(); // 使用现有的fetchEvents()方法获取所有事件
        List<DisciplineInfo> disciplineInfos = new ArrayList<>();

        for (Event event : events) {
            for (Event.Sport sport : event.getSports()) {
                for (Event.Discipline discipline : sport.getDisciplineList()) {
                    disciplineInfos.add(new DisciplineInfo(discipline.getId(), discipline.getDisciplineName(), sport.getCode()));
                }
            }
        }

        return disciplineInfos;
    }
}
