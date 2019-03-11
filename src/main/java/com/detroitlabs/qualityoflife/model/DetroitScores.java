package com.detroitlabs.qualityoflife.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DetroitScores {

    private AllScoresData allScoresData;
    private Categories categories;


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
}
