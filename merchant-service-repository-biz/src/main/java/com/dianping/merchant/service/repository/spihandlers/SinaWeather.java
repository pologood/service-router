/** *dianping.com Inc *Copyright(c)2004-2015 All Rights Reserved. */package com.dianping.merchant.service.repository.spihandlers;import com.dianping.merchant.service.repository.annotations.Handler;import com.dianping.merchant.service.repository.handler.SpiHandler;import com.dianping.merchant.service.repository.model.SpiServiceRequest;import com.dianping.merchant.service.repository.model.SpiServiceResult;import org.springframework.stereotype.Service;/** * @author zhangjie * @version $Id: gaodeweather.java, v 0.1 2015-09-30 下午2:46 zhangjie Exp $$ */@Handler(providerName = "sinaweather")@Servicepublic class SinaWeather implements SpiHandler {    @Override    public SpiServiceResult handle(SpiServiceRequest request) {        System.out.println("====================================================================");        System.out.println("this is sian weather handler speaking");        System.out.println("it's a cloudy day,isn't it?");        System.out.println("====================================================================");        SpiServiceResult result = new SpiServiceResult();        result.setSuccess(true);        result.setServieContent("this is sina weather,hou hou ");        return result;    }}