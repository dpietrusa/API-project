package com.detroitlabs.qualityoflife.controller;

import com.detroitlabs.qualityoflife.model.AllScoresData;
import com.detroitlabs.qualityoflife.model.Categories;
import com.detroitlabs.qualityoflife.model.CityNameData;
import com.detroitlabs.qualityoflife.model.DetroitScores;
import com.detroitlabs.qualityoflife.service.CityNameService;
import com.detroitlabs.qualityoflife.service.CityStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CityController {
    @Autowired
    private CityNameService cityNameService;

    @Autowired
    private CityStatsService cityStatsService;


    @RequestMapping("/")
//    @ResponseBody
    public String home(ModelMap modelMap){
        CityNameData cityNameData = cityNameService.fetchCityNameData();
        DetroitScores detroitScores = cityStatsService.fetchAllScoresData();
        Categories categories = detroitScores.getCategories();
        String modifiedSummary = detroitScores.getSummary().replaceAll("\\<.*?>","");

        modelMap.put("cityName", cityNameData.getFull_name());

        List<AllScoresData> categoriesScores = detroitScores.getAllCategories();
        modelMap.put("categoriesScores", categoriesScores);

        modelMap.put("summary", modifiedSummary);

//        return cityNameData.getFull_name() + ": " + categories.get(0).getName()
//                + detroitScores.getSummary() + detroitScores.getAllCategories();
    return "home";
    }


}
