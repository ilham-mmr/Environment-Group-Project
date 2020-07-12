package com.environment.view.Flower;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chin Shu Hui
 */
import java.io.Serializable;

public class FlowerData implements Serializable {

    String name;
    private String healthBenefits,commonUse;

    public FlowerData(String name, String healthBenefits, String commonUse) {
        this.name = name;
        this.healthBenefits = healthBenefits;
        this.commonUse = commonUse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHealthBenefits() {
        return healthBenefits;
    }

    public void setHealthBenefits(String healthBenefits) {
        this.healthBenefits = healthBenefits;
    }

    public String getCommonUse() {
        return commonUse;
    }

    public void setCommonUse(String commonUse) {
        this.commonUse = commonUse;
    }
}