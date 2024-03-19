package com.extazy.backend.controller;

import com.extazy.backend.entity.DisciplineInfo;
import com.extazy.backend.entity.Event;
import com.extazy.backend.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/event")
    public List<Event> getEvents() {
        return eventService.fetchEvents();
    }

    @GetMapping("/disciplines")
    public List<DisciplineInfo> getDisciplines() {
        return eventService.fetchDisciplines();
    }
}
