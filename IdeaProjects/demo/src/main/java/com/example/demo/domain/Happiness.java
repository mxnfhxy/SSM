package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Happiness {
    private Long id;
    private String city;
    private Integer num;
    private List<Map<String, Object>> cities = new ArrayList<Map<String, Object>>();

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setCities(List<Map<String, Object>> cities) {
        this.cities = cities;
    }

    public List<Map<String, Object>> getCities() {
        return cities;
    }
}
