package com.detroitlabs.qualityoflife.controller;

import com.detroitlabs.qualityoflife.model.CityScores;
import com.detroitlabs.qualityoflife.service.CityScoresAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class CityController {
    @Autowired
    private CityScoresAPI cityScoresAPI;

    @RequestMapping("/")
    @ResponseBody
    public String displayName(){
        CityScores cityScores = cityScoresAPI.fetchCityScores();
        return cityScores.getFull_name();
//        return cityScores.getGeohash();
    }


}
