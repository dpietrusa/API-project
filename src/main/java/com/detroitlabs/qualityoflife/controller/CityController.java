package com.detroitlabs.qualityoflife.controller;

import com.detroitlabs.qualityoflife.model.AllScoresData;
import com.detroitlabs.qualityoflife.model.Categories;
import com.detroitlabs.qualityoflife.model.CityNameData;
import com.detroitlabs.qualityoflife.model.DetroitScores;
import com.detroitlabs.qualityoflife.service.CityNameService;
import com.detroitlabs.qualityoflife.service.CityStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class CityController {
    @Autowired
    private CityNameService cityNameService;

    @Autowired
    private CityStatsService cityStatsService;


    @RequestMapping("/")
    @ResponseBody
    public String displayName(){
        CityNameData cityNameData = cityNameService.fetchCityNameData();

        DetroitScores detroitScores = cityStatsService.fetchAllScoresData();
        Categories categories = detroitScores.getCategories();





        return cityNameData.getFull_name() + ": " + categories.get(0).getName();
    }


}
