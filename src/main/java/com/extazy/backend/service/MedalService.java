package com.extazy.backend.service;

import com.extazy.backend.entity.Medal;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Service
public class MedalService {

    public List<Medal> fetchMedals(String discipline) {
        String baseUrl = "https://api.worldaquatics.com/fina/competitions/2969/medals?discipline=";
        String finalUrl = baseUrl + (discipline == null || discipline.isEmpty() ? "" : "?discipline=" + discipline);
        RestTemplate restTemplate = new RestTemplate();
        Medal[] medalsArray = restTemplate.getForObject(finalUrl, Medal[].class);
        return Arrays.asList(medalsArray);
    }
}
