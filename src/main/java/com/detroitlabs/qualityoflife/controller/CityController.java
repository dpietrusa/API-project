package com.detroitlabs.qualityoflife.controller;

import com.detroitlabs.qualityoflife.model.AllScoresData;
import com.detroitlabs.qualityoflife.model.Categories;
import com.detroitlabs.qualityoflife.model.CityScores;
import com.detroitlabs.qualityoflife.model.GeneralCityData;
import com.detroitlabs.qualityoflife.service.CityNameService;
import com.detroitlabs.qualityoflife.service.CityStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class CityController {
    @Autowired
    private CityNameService cityNameService;

    @Autowired
    private CityStatsService cityStatsService;


    @RequestMapping("/")
    public String home(ModelMap modelMap){
        GeneralCityData generalCityData = cityNameService.fetchCityNameData();
        CityScores cityScores = cityStatsService.fetchAllScoresData();
        Categories categories = cityScores.getCategories();
        String modifiedSummary = cityScores.getSummary().replaceAll("\\<.*?>","");

        modelMap.put("cityName", generalCityData.getFull_name());

        List<AllScoresData> categoriesScores = cityScores.getAllCategories();

        modelMap.put("categoriesScores", categoriesScores);

        modelMap.put("summary", modifiedSummary);

        modelMap.put("population", generalCityData.getPopulation());

//        return generalCityData.getFull_name() + ": " + categories.get(0).getName()
//                + cityScores.getSummary() + cityScores.getAllCategories();
    return "home";
    }


}
