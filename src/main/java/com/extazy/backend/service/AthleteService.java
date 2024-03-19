package com.extazy.backend.service;

import com.extazy.backend.entity.Athlete;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Service
public class AthleteService {

    public List<Athlete> fetchAthletes(String gender, String discipline, String countryId) {
        // 使用默认查询参数初始化URL
        String baseUrl = "https://api.worldaquatics.com/fina/competitions/2969/athletes?gender=&discipline=&countryId=";

        // 检查并更新参数
        if (gender != null && !gender.isEmpty()) {
            baseUrl = baseUrl.replace("gender=", "gender=" + gender);
        }
        if (discipline != null && !discipline.isEmpty()) {
            baseUrl = baseUrl.replace("discipline=", "discipline=" + discipline);
        }
        if (countryId != null && !countryId.isEmpty()) {
            baseUrl = baseUrl.replace("countryId=", "countryId=" + countryId);
        }

        // 使用RestTemplate发起HTTP GET请求
        RestTemplate restTemplate = new RestTemplate();
        Athlete[] athletesArray = restTemplate.getForObject(baseUrl, Athlete[].class);

        // 将数组转换为列表并返回
        return Arrays.asList(athletesArray);
    }
}
