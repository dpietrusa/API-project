package com.detroitlabs.qualityoflife.service;


import com.detroitlabs.qualityoflife.model.CityScores;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CityStatsService {

    public CityScores fetchAllScoresData() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://api.teleport.org/api/urban_areas/slug:detroit/scores/",
                CityScores.class);

    }


    }

