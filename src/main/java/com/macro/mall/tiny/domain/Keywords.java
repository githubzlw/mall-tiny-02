package com.macro.mall.tiny.domain;

public class Keywords {

    private int campaignId;
    private int adGroupId;
    private String state;
    private String keywordText;
    private String nativeLanguageKeyword;
    private String nativeLanguageLocale;
    private String matchType;
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

    public String getKeywordText() {
        return keywordText;
    }

    public void setKeywordText(String keywordText) {
        this.keywordText = keywordText;
    }

    public String getNativeLanguageKeyword() {
        return nativeLanguageKeyword;
    }

    public void setNativeLanguageKeyword(String nativeLanguageKeyword) {
        this.nativeLanguageKeyword = nativeLanguageKeyword;
    }

    public String getNativeLanguageLocale() {
        return nativeLanguageLocale;
    }

    public void setNativeLanguageLocale(String nativeLanguageLocale) {
        this.nativeLanguageLocale = nativeLanguageLocale;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }
}
