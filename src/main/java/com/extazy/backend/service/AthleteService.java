package com.extazy.backend.service;

import com.extazy.backend.entity.Athlete;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class AthleteService {

    public List<Athlete> fetchAthletes() {
        String url = "https://api.worldaquatics.com/fina/competitions/2969/athletes?gender=&discipline=&countryId=";
        RestTemplate restTemplate = new RestTemplate();
        Athlete[] athletesArray = restTemplate.getForObject(url, Athlete[].class);
        return Arrays.asList(athletesArray);
    }
}
