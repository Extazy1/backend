package com.extazy.backend.controller;

import com.extazy.backend.entity.Schedule;
import com.extazy.backend.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/schedule")
    // /api/schedule路径可以不带任何查询参数来访问，也可以附加一个discipline查询参数（如/api/schedule?discipline=HD）
    public List<Schedule> getEvents(@RequestParam(required = false) String discipline) {
        return scheduleService.fetchSchedules(discipline);
    }
}
