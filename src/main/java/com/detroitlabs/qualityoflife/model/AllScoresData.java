package com.detroitlabs.qualityoflife.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.lang.reflect.Array;
import java.util.ArrayList;


@JsonIgnoreProperties(ignoreUnknown = true)
public class AllScoresData {

    String name;
    double score_out_of_10;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore_out_of_10() {
        return score_out_of_10;
    }

    public void setScore_out_of_10(double score_out_of_10) {
        this.score_out_of_10 = score_out_of_10;
    }





}
