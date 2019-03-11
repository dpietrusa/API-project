package com.detroitlabs.qualityoflife.service;


import com.detroitlabs.qualityoflife.model.CityNameData;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CityNameAPI {

    public CityNameData fetchCityNameData(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(
                "https://api.teleport.org/api/cities/geonameid:4990729/", CityNameData.class);
    }




}
