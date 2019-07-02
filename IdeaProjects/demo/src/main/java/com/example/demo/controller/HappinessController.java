package com.example.demo.controller;

import com.example.demo.domain.Happiness;
import com.example.demo.services.HappinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/demo")
public class HappinessController {

    @Autowired
    private HappinessService happinessService;

    @RequestMapping("/query")
    public List<Map<String, Object>> testQuery(){
        return happinessService.selectService("xian");
    }

    @RequestMapping("/insert")
    public List<Map<String, Object>> testInsert(){
        happinessService.insertService();
        return happinessService.selectService("西安");
    }

}
