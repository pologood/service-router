/** *dianping.com Inc *Copyright(c)2004-2015 All Rights Reserved. */package com.dianping.merchant.service.repository.enums;/** * 路由器类型枚举 * * @author zhangjie * @version $Id: RouterTypeEnum.java, v 0.1 2015-09-28 下午4:17 zhangjie Exp $$ */public enum RouterTypeEnum {    /**     * 选择创建时间最新的服务实现     */    NEWEST(0, "创建时间最新"),    /**     * 选择创建时间最早的服务实现     */    OLDEST(1, "创建时间最早"),    /**     * 根据groovy选择     */    GROOVY(2,"根据groovy选择");    private int code;    private String desc;    RouterTypeEnum(int code, String desc) {        this.code = code;        this.desc = desc;    }}