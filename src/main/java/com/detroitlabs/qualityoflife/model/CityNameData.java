package com.detroitlabs.qualityoflife.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CityScores {

    private String full_name;
    private String geohash;


//    @JsonProperty("location")
//    public String getGeohash() {
//        return geohash;
//    }
//
//    @JsonProperty("location")
//    public void setGeohash(String geohash) {
//        this.geohash = geohash;
//    }


    @JsonProperty("full_name")
    public String getFull_name() {
        return full_name;
    }


    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }





}
