package com.macro.mall.tiny.controller;

import com.alibaba.fastjson.JSONObject;
import com.macro.mall.tiny.common.api.CommonPage;
import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.domain.*;
import com.macro.mall.tiny.util.BeanMapUtilByReflect;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 亚马逊广告Controller
 * Created by zlw on 2022/11/11.
 */
@Api(tags = "AmazonApiController", description = "亚马逊广告")
@Controller
@RequestMapping("/amazon")
public class AmazonApiController {


    @ApiOperation("campaigns广告API")
    @RequestMapping(value = "/campaigns", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult campaigns(@RequestBody Campaigns cam) throws IllegalAccessException {

//        Campaigns cam = new Campaigns();
        cam.setPortfolioId(0);
        cam.setName("qweqwe");

        Tags tags = new Tags();
        tags.setPONumber("asdass");
        tags.setAccountManager("asdas");
        cam.setTags(tags);

        cam.setCampaignType("sdfs");
        cam.setTargetingType("sdfsd");
        cam.setState("enabled");
        cam.setDailyBudget(0);
        cam.setState("20220822");
        cam.setEndDate("20220922");
        cam.setPremiumBidAdjustment(true);


        Bidding bidding = new Bidding();
        bidding.setStrategy("legacyForSales");
        List<Adjustments> adjustmentsList = new ArrayList<Adjustments>();
        Adjustments ments = new Adjustments();
        ments.setPredicate("sdfasd");
        ments.setPercentage(0);
        adjustmentsList.add(ments);
        bidding.setAdjustments(adjustmentsList);
        cam.setBidding(bidding);


        Map<String, Object> map = BeanMapUtilByReflect.beanToMap(cam.getClass());

//        String jsonStr=JSONObject.toJSONString(cam);

        return CommonResult.success(map);
//        return jsonStr;

    }

    @RequestMapping(value = "/adgroups", method = RequestMethod.POST)
    @ResponseBody
    public String adgroups(@RequestBody Adgroups adgroups){

//        Adgroups adgroups = new Adgroups();
        adgroups.setName("sdfsd");
        adgroups.setCampaignId(0);
        adgroups.setDefaultBid(0);
        adgroups.setState("enabled");

        String jsonStr=JSONObject.toJSONString(adgroups);
        return jsonStr;

    }


    @RequestMapping(value = "/productads", method = RequestMethod.POST)
    @ResponseBody
    public String productads(@RequestBody Productads pro){

//        Productads pro = new Productads();
        pro.setCampaignId(0);
        pro.setAdGroupId(0);
        pro.setSku("sdfsd");
        pro.setAsin("sdfas");
        pro.setState("enabled");

        String jsonStr=JSONObject.toJSONString(pro);
        return jsonStr;

    }

    @RequestMapping(value = "/keywords", method = RequestMethod.POST)
    @ResponseBody
    public String keywords(@RequestBody Keywords key){

//        Keywords key = new Keywords();
        key.setCampaignId(0);
        key.setAdGroupId(0);
        key.setState("enabled");
        key.setKeywordText("dd");
        key.setNativeLanguageKeyword("sdfs");
        key.setNativeLanguageLocale("sdfs");
        key.setMatchType("sdfsd");
        key.setBid(0);

        String jsonStr=JSONObject.toJSONString(key);
        return jsonStr;

    }

    @RequestMapping(value = "/producttargeting", method = RequestMethod.POST)
    @ResponseBody
    public String producttargeting(@RequestBody Producttargeting prot){

//        Producttargeting prot = new Producttargeting();
        prot.setCampaignId(0);
        prot.setAdGroupId(0);
        prot.setState("enabled");

        List<Expression> lsEx = new ArrayList<Expression>();
        Expression ex = new Expression();
        ex.setType("qr");
        ex.setValue("sdfs");
        lsEx.add(ex);
        prot.setExpression(lsEx);

        List<ResolvedExpression> lsRes = new ArrayList<ResolvedExpression>();
        ResolvedExpression res = new ResolvedExpression();
        res.setType("qr");
        res.setValue("sdfs");
        lsRes.add(res);
        prot.setResolvedExpression(lsRes);

        prot.setExpressionType("sdfs");
        prot.setBid(0);

        String jsonStr=JSONObject.toJSONString(prot);
        return jsonStr;

    }

}
