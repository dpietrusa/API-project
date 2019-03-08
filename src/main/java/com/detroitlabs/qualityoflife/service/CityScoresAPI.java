package com.detroitlabs.qualityoflife.service;


import com.detroitlabs.qualityoflife.model.CityScores;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CityScoresAPI {

    public CityScores fetchCityScores(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(
                "https://api.teleport.org/api/cities/geonameid:4990729/", CityScores.class);
    }
}
