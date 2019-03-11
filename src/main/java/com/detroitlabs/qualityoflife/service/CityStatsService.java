package com.detroitlabs.qualityoflife.service;


import com.detroitlabs.qualityoflife.model.AllScoresData;
import com.detroitlabs.qualityoflife.model.DetroitScores;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class CityStatsService {


    public DetroitScores fetchAllScoresData() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://api.teleport.org/api/urban_areas/slug:detroit/scores/",
                DetroitScores.class);

    }


    }

