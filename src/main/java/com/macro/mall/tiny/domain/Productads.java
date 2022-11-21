package com.macro.mall.tiny.domain;

public class Productads {

    private int campaignId;
    private int adGroupId;
    private String sku;
    private String asin;
    private String state;

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

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
