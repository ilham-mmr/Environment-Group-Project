/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.environment.view;

import java.util.EventObject;

/**
 *
 * @author Ilham MMR <ilham.mmr@gmail.com>
 */
public class UpdateTestInfo extends EventObject{
     String id,wetMarketName,location,testedAnimal,covidResult,date;

      public UpdateTestInfo(String id, String wetMarketName, String location, String testedAnimal, String covidResult, String date,Object source) {
        super(source);
        this.id = id;
        this.wetMarketName = wetMarketName;
        this.location = location;
        this.testedAnimal = testedAnimal;
        this.covidResult = covidResult;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWetMarketName() {
        return wetMarketName;
    }

    public void setWetMarketName(String wetMarketName) {
        this.wetMarketName = wetMarketName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTestedAnimal() {
        return testedAnimal;
    }

    public void setTestedAnimal(String testedAnimal) {
        this.testedAnimal = testedAnimal;
    }

    public String getCovidResult() {
        return covidResult;
    }

    public void setCovidResult(String covidResult) {
        this.covidResult = covidResult;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
