package com.macro.mall.tiny.domain;

import java.util.List;

public class Producttargeting {

    private int campaignId;
    private int adGroupId;
    private String state;

    private List<Expression> expression;
    private List<ResolvedExpression> resolvedExpression;

    private String expressionType;
    private int bid;

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }

    public int getAdGroupId() {
        return adGroupId;
    }

    public void setAdGroupId(int adGroupId) {
        this.adGroupId = adGroupId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<Expression> getExpression() {
        return expression;
    }

    public void setExpression(List<Expression> expression) {
        this.expression = expression;
    }

    public List<ResolvedExpression> getResolvedExpression() {
        return resolvedExpression;
    }

    public void setResolvedExpression(List<ResolvedExpression> resolvedExpression) {
        this.resolvedExpression = resolvedExpression;
    }

    public String getExpressionType() {
        return expressionType;
    }

    public void setExpressionType(String expressionType) {
        this.expressionType = expressionType;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }
}
