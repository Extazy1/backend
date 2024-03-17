package com.extazy.backend.controller;

import com.extazy.backend.entity.Medal;
import com.extazy.backend.service.MedalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MedalController {

    @Autowired
    private MedalService medalService;

    @GetMapping("/medal")
    // /api/medal路径可以不带任何查询参数来访问，也可以附加一个discipline查询参数（如/api/medal?discipline=HD）
    public List<Medal> getEvents(@RequestParam(required = false) String discipline) {
        return medalService.fetchMedals(discipline);
    }
}
