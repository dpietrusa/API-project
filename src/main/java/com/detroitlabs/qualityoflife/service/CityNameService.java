package com.detroitlabs.qualityoflife.service;


import com.detroitlabs.qualityoflife.model.GeneralCityData;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CityNameService {

    public GeneralCityData fetchCityNameData(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(
                "https://api.teleport.org/api/cities/geonameid:4990729/", GeneralCityData.class);
    }




}
