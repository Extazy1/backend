package com.extazy.backend.controller;

import com.extazy.backend.service.EventService;
import com.extazy.backend.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ResultController {
    private final EventService eventService;
    private final ResultService resultService;

    @Autowired
    public ResultController(EventService eventService, ResultService resultService) {
        this.eventService = eventService;
        this.resultService = resultService;
    }

    @GetMapping("/result")
    public List<?> getResults(@RequestParam(required = false) String disciplineName) {
        if (disciplineName == null || disciplineName.isEmpty()) {
            // 处理没有提供赛事名称的情况，根据实际需求调整
            System.out.println("Discipline name is required");
            return new ArrayList<>();
        }
        return resultService.fetchResults(disciplineName);
    }
}
