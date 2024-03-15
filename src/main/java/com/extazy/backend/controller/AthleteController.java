package com.extazy.backend.controller;

import com.extazy.backend.entity.Athlete;
import com.extazy.backend.service.AthleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AthleteController {

    @Autowired
    private AthleteService athleteService;

    @GetMapping("/athlete")
    public List<Athlete> getEvents() {
        return athleteService.fetchAthletes();
    }
}
