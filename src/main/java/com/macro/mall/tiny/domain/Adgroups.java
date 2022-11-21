package com.macro.mall.tiny.domain;

public class Adgroups {

    private String name;
    private int campaignId;
    private int defaultBid;
    private String state;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }

    public int getDefaultBid() {
        return defaultBid;
    }

    public void setDefaultBid(int defaultBid) {
        this.defaultBid = defaultBid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
