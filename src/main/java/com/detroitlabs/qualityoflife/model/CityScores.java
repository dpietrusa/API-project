package com.detroitlabs.qualityoflife.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class CityScores {

    private AllScoresData allScoresData;
    private Categories categories;
    private String summary;

    public List<AllScoresData> getAllCategories() {
        List<AllScoresData> allScoresData = new ArrayList<>();

        for (int i = 1; i < categories.size(); i++) {
            allScoresData.add(categories.get(i));

        }return allScoresData;
    }


    public AllScoresData getAllScoresData() {
        return allScoresData;
    }

    public void setAllScoresData(AllScoresData allScoresData) {
        this.allScoresData = allScoresData;
    }

    @JsonProperty("categories")
    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
