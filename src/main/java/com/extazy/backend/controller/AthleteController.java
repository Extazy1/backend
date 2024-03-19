package com.extazy.backend.controller;

import com.extazy.backend.entity.Athlete;
import com.extazy.backend.service.AthleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AthleteController {

    @Autowired
    private AthleteService athleteService;

    @GetMapping("/athletes")
    public List<Athlete> getAthletes(@RequestParam(required = false, defaultValue = "") String gender,
                                     @RequestParam(required = false, defaultValue = "") String discipline,
                                     @RequestParam(required = false, defaultValue = "") String countryId) {
        return athleteService.fetchAthletes(gender, discipline, countryId);
    }
}
