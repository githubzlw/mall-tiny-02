package com.macro.mall.tiny.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UmsMember implements Serializable {
    private Long id;

    private Long memberLevelId;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "手机号码")
    private String phone;

    @ApiModelProperty(value = "帐号启用状态:0->禁用；1->启用")
    private Integer status;

    @ApiModelProperty(value = "注册时间")
    private Date createTime;

    @ApiModelProperty(value = "头像")
    private String icon;

    @ApiModelProperty(value = "性别：0->未知；1->男；2->女")
    private Integer gender;

    @ApiModelProperty(value = "生日")
    private Date birthday;

    @ApiModelProperty(value = "所做城市")
    private String city;

    @ApiModelProperty(value = "职业")
    private String job;

    @ApiModelProperty(value = "个性签名")
    private String personalizedSignature;

    @ApiModelProperty(value = "用户来源")
    private Integer sourceType;

    @ApiModelProperty(value = "积分")
    private Integer integration;

    @ApiModelProperty(value = "成长值")
    private Integer growth;

    @ApiModelProperty(value = "剩余抽奖次数")
    private Integer luckeyCount;

    @ApiModelProperty(value = "历史积分数量")
    private Integer historyIntegration;

    @ApiModelProperty(value = "组织名")
    private String organizationname;

    @ApiModelProperty(value = "月订单")
    private String monthlyOrders;

    @ApiModelProperty(value = "第三方标识")
    private Integer loginType;

    @ApiModelProperty(value = "客户余额")
    private Double balance;

    @ApiModelProperty(value = "shopify的店铺名称")
    private String shopifyName;

    @ApiModelProperty(value = "shopify状态0未绑定 1 绑定成功 2取消绑定")
    private Integer shopifyFlag;

    @ApiModelProperty(value = "引导标识 0未引导 1 已引导")
    private Integer guidedFlag;

    @ApiModelProperty(value = "国家id")
    private Integer countryId;

    @ApiModelProperty(value = "sourcing运输方式  1进FBA, 2 进客户门点, 3 CIF")
    private Integer sourcingTypeOfShipping;

    @ApiModelProperty(value = "sourcing选择类型 1:Drop Shipping  2:Wholesale and Bulk Shipping 3 Transportation Only:  4:Product Customization")
    private Integer sourcingChooseType;

    @ApiModelProperty(value = "sourcing目的国家")
    private String sourcingCountryName;

    @ApiModelProperty(value = "sourcing国家id")
    private Integer sourcingCountryId;

    @ApiModelProperty(value = "sourcing目的州或者城市")
    private String sourcingStateName;

    @ApiModelProperty(value = "sourcing 定制类型 1:changePackaging 2:changeColor,Material 3:Improve Quality 4:changeShape")
    private String sourcingCustomType;

    @ApiModelProperty(value = "sourcing询问订单量")
    private Integer sourcingOrderQuantity;

    @ApiModelProperty(value = "sourcing客户备注")
    private String sourcingRemark;

    @ApiModelProperty(value = "sourcing 1货源已处理")
    private Integer sourcingPrcFlag;

    @ApiModelProperty(value = "sourcing aliexpress处理")
    private String sourcingPricePs;

    @ApiModelProperty(value = "sourcing cif的港口")
    private String sourcingCifPort;

    @ApiModelProperty(value = "sourcing amazon的fba地址")
    private String sourcingFbaWarehouse;

    @ApiModelProperty(value = "发货使用的logo地址")
    private String logoUrl;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberLevelId() {
        return memberLevelId;
    }

    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPersonalizedSignature() {
        return personalizedSignature;
    }

    public void setPersonalizedSignature(String personalizedSignature) {
        this.personalizedSignature = personalizedSignature;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public Integer getLuckeyCount() {
        return luckeyCount;
    }

    public void setLuckeyCount(Integer luckeyCount) {
        this.luckeyCount = luckeyCount;
    }

    public Integer getHistoryIntegration() {
        return historyIntegration;
    }

    public void setHistoryIntegration(Integer historyIntegration) {
        this.historyIntegration = historyIntegration;
    }

    public String getOrganizationname() {
        return organizationname;
    }

    public void setOrganizationname(String organizationname) {
        this.organizationname = organizationname;
    }

    public String getMonthlyOrders() {
        return monthlyOrders;
    }

    public void setMonthlyOrders(String monthlyOrders) {
        this.monthlyOrders = monthlyOrders;
    }

    public Integer getLoginType() {
        return loginType;
    }

    public void setLoginType(Integer loginType) {
        this.loginType = loginType;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getShopifyName() {
        return shopifyName;
    }

    public void setShopifyName(String shopifyName) {
        this.shopifyName = shopifyName;
    }

    public Integer getShopifyFlag() {
        return shopifyFlag;
    }

    public void setShopifyFlag(Integer shopifyFlag) {
        this.shopifyFlag = shopifyFlag;
    }

    public Integer getGuidedFlag() {
        return guidedFlag;
    }

    public void setGuidedFlag(Integer guidedFlag) {
        this.guidedFlag = guidedFlag;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getSourcingTypeOfShipping() {
        return sourcingTypeOfShipping;
    }

    public void setSourcingTypeOfShipping(Integer sourcingTypeOfShipping) {
        this.sourcingTypeOfShipping = sourcingTypeOfShipping;
    }

    public Integer getSourcingChooseType() {
        return sourcingChooseType;
    }

    public void setSourcingChooseType(Integer sourcingChooseType) {
        this.sourcingChooseType = sourcingChooseType;
    }

    public String getSourcingCountryName() {
        return sourcingCountryName;
    }

    public void setSourcingCountryName(String sourcingCountryName) {
        this.sourcingCountryName = sourcingCountryName;
    }

    public Integer getSourcingCountryId() {
        return sourcingCountryId;
    }

    public void setSourcingCountryId(Integer sourcingCountryId) {
        this.sourcingCountryId = sourcingCountryId;
    }

    public String getSourcingStateName() {
        return sourcingStateName;
    }

    public void setSourcingStateName(String sourcingStateName) {
        this.sourcingStateName = sourcingStateName;
    }

    public String getSourcingCustomType() {
        return sourcingCustomType;
    }

    public void setSourcingCustomType(String sourcingCustomType) {
        this.sourcingCustomType = sourcingCustomType;
    }

    public Integer getSourcingOrderQuantity() {
        return sourcingOrderQuantity;
    }

    public void setSourcingOrderQuantity(Integer sourcingOrderQuantity) {
        this.sourcingOrderQuantity = sourcingOrderQuantity;
    }

    public String getSourcingRemark() {
        return sourcingRemark;
    }

    public void setSourcingRemark(String sourcingRemark) {
        this.sourcingRemark = sourcingRemark;
    }

    public Integer getSourcingPrcFlag() {
        return sourcingPrcFlag;
    }

    public void setSourcingPrcFlag(Integer sourcingPrcFlag) {
        this.sourcingPrcFlag = sourcingPrcFlag;
    }

    public String getSourcingPricePs() {
        return sourcingPricePs;
    }

    public void setSourcingPricePs(String sourcingPricePs) {
        this.sourcingPricePs = sourcingPricePs;
    }

    public String getSourcingCifPort() {
        return sourcingCifPort;
    }

    public void setSourcingCifPort(String sourcingCifPort) {
        this.sourcingCifPort = sourcingCifPort;
    }

    public String getSourcingFbaWarehouse() {
        return sourcingFbaWarehouse;
    }

    public void setSourcingFbaWarehouse(String sourcingFbaWarehouse) {
        this.sourcingFbaWarehouse = sourcingFbaWarehouse;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberLevelId=").append(memberLevelId);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", nickname=").append(nickname);
        sb.append(", phone=").append(phone);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", icon=").append(icon);
        sb.append(", gender=").append(gender);
        sb.append(", birthday=").append(birthday);
        sb.append(", city=").append(city);
        sb.append(", job=").append(job);
        sb.append(", personalizedSignature=").append(personalizedSignature);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", integration=").append(integration);
        sb.append(", growth=").append(growth);
        sb.append(", luckeyCount=").append(luckeyCount);
        sb.append(", historyIntegration=").append(historyIntegration);
        sb.append(", organizationname=").append(organizationname);
        sb.append(", monthlyOrders=").append(monthlyOrders);
        sb.append(", loginType=").append(loginType);
        sb.append(", balance=").append(balance);
        sb.append(", shopifyName=").append(shopifyName);
        sb.append(", shopifyFlag=").append(shopifyFlag);
        sb.append(", guidedFlag=").append(guidedFlag);
        sb.append(", countryId=").append(countryId);
        sb.append(", sourcingTypeOfShipping=").append(sourcingTypeOfShipping);
        sb.append(", sourcingChooseType=").append(sourcingChooseType);
        sb.append(", sourcingCountryName=").append(sourcingCountryName);
        sb.append(", sourcingCountryId=").append(sourcingCountryId);
        sb.append(", sourcingStateName=").append(sourcingStateName);
        sb.append(", sourcingCustomType=").append(sourcingCustomType);
        sb.append(", sourcingOrderQuantity=").append(sourcingOrderQuantity);
        sb.append(", sourcingRemark=").append(sourcingRemark);
        sb.append(", sourcingPrcFlag=").append(sourcingPrcFlag);
        sb.append(", sourcingPricePs=").append(sourcingPricePs);
        sb.append(", sourcingCifPort=").append(sourcingCifPort);
        sb.append(", sourcingFbaWarehouse=").append(sourcingFbaWarehouse);
        sb.append(", logoUrl=").append(logoUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}