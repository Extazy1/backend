package com.extazy.backend.service;

import com.extazy.backend.entity.Schedule;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ScheduleService {

    public List<Schedule> fetchSchedules() {
        String url = "https://api.worldaquatics.com/fina/competitions/2969/schedule?discipline=";
        RestTemplate restTemplate = new RestTemplate();
        Schedule[] schedulesArray = restTemplate.getForObject(url, Schedule[].class);
        return Arrays.asList(schedulesArray);
    }
}
