/** *dianping.com Inc *Copyright(c)2004-2015 All Rights Reserved. */package com.dianping.merchant.service.repository.enums;/** * @author zhangjie * @version $Id: SpiServiceTypeEnum.java, v 0.1 2015-09-28 下午4:17 zhangjie Exp $$ */public enum SpiServiceTypeEnum {    /**     * 商家平台Pigeon服务     */    MERCHNAT(0),    /**     * mapi服务     */    MAPI(1),    /**     * rest风格服务     */    REST(2);    private int code;    SpiServiceTypeEnum(int code){        this.code=code;    }}