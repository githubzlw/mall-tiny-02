package com.macro.mall.tiny.domain;

import java.util.List;

public class Bidding {
    private String strategy;

    private List<Adjustments> adjustments;


    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public List<Adjustments> getAdjustments() {
        return adjustments;
    }

    public void setAdjustments(List<Adjustments> adjustments) {
        this.adjustments = adjustments;
    }
}
