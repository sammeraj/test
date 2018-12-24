package com.example.service;

import java.util.List;

import com.example.model.City;

public interface CityServiceImp {

    public List<City> findByName(String name, String count);
}
