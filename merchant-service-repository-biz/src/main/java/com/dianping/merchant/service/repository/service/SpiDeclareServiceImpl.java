/** *dianping.com Inc *Copyright(c)2004-2015 All Rights Reserved. */package com.dianping.merchant.service.repository.service;import com.dianping.merchant.service.repository.entity.SpiServiceProvider;import com.dianping.merchant.service.repository.exception.SpiServiceException;import com.dianping.merchant.service.repository.manage.SpiServiceManager;import com.dianping.merchant.service.repository.model.SpiServiceRequest;import com.dianping.merchant.service.repository.model.SpiServiceResult;import com.dianping.merchant.service.repository.router.RouterContext;import com.dianping.merchant.service.repository.router.SpiRouterService;import javax.annotation.Resource;/** * @author zhangjie * @version $Id: SpiServiceImpl.java, v 0.1 2015-09-28 下午4:33 zhangjie Exp $$ */public class SpiDeclareServiceImpl implements SpiDeclareService {    @Resource    private SpiRouterService spiRouterService;    @Resource    private SpiServiceManager spiServiceManager;    @Override    public SpiServiceResult execute(SpiServiceRequest request) {        //param check        paramCheck(request);        int serviceCode = request.getServiceCode();        SpiServiceProvider provider = spiRouterService.select(serviceCode, new RouterContext());        return spiServiceManager.handle(provider, request);    }    private void paramCheck(SpiServiceRequest request) {        if (request == null) {            throw new SpiServiceException("request can not be null");        }        if (request.getServiceCode() == null) {            throw new SpiServiceException("service code can not be null");        }    }}