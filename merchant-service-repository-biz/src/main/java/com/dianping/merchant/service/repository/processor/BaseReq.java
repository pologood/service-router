/** *dianping.com Inc *Copyright(c)2004-2015 All Rights Reserved. */package com.dianping.merchant.service.repository.processor;import org.apache.commons.lang.builder.ToStringBuilder;import org.apache.commons.lang.builder.ToStringStyle;import java.io.Serializable;/** * @author zhangjie * @version $Id: BaseReq.java, v 0.1 2015-11-16 下午5:26 zhangjie Exp $$ */public class BaseReq implements Serializable {    private static final long serialVersionUID = 8329011975036218621L;    @Override    public String toString() {        return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);    }}