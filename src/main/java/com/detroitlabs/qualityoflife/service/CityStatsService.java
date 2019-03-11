package com.detroitlabs.qualityoflife.service;


import com.detroitlabs.qualityoflife.model.CityStatsData;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class CityStatsService {


    public CityStatsData fetchCityStatsData() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://api.teleport.org/api/urban_areas/slug:detroit/scores/",
                CityStatsData.class);

    }




    }

