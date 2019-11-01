package com.example.demo.city;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired
    CityMapper cityMapper;

    void insert(City city) {
        cityMapper.insert(city);
    }

    City findById(long id) {
        return cityMapper.findById(id);
        // City c = new City();
        // c.setId(id);
        // c.setName("name");
        // c.setCountry("country");
        // c.setState("state");
        // return c;
    }

}