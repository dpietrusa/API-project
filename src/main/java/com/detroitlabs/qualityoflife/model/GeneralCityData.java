package com.detroitlabs.qualityoflife.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GeneralCityData {

    private String full_name;
    private String geohash;
    private String population;


    @JsonProperty("full_name")
    public String getFull_name() {
        return full_name;
    }


    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    @JsonProperty("population")
    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }
}
