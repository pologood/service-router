/** *dianping.com Inc *Copyright(c)2004-2015 All Rights Reserved. */package com.dianping.merchant.service.repository.entity;import java.util.Date;/** * 服务实体 * * @author zhangjie * @version $Id: SpiServiceEntity.java, v 0.1 2015-09-28 下午3:49 zhangjie Exp $$ */public class SpiService extends ToString {    /**     * 服务ID     */    private int id;    /**     * 服务代码     */    private int serviceCode;    /**     * 服务名称     */    private String serviceName;    /**     * 服务类型     */    private String serviceType;    /**     * 添加时间     */    private Date addTime;    /**     * 更新时间     */    private Date updateTime;    /**     * 服务状态     */    private int status;    /**     * 服务使用的路由规则     */    private int routerId;    public int getId() {        return id;    }    public void setId(int id) {        this.id = id;    }    public void setServiceCode(int serviceCode) {        this.serviceCode = serviceCode;    }    public String getServiceName() {        return serviceName;    }    public void setServiceName(String serviceName) {        this.serviceName = serviceName;    }    public String getServiceType() {        return serviceType;    }    public void setServiceType(String serviceType) {        this.serviceType = serviceType;    }    public Date getAddTime() {        return addTime;    }    public void setAddTime(Date addTime) {        this.addTime = addTime;    }    public Date getUpdateTime() {        return updateTime;    }    public void setUpdateTime(Date updateTime) {        this.updateTime = updateTime;    }    public int getStatus() {        return status;    }    public void setStatus(int status) {        this.status = status;    }    public int getServiceCode() {        return serviceCode;    }    public int getRouterId() {        return routerId;    }    public void setRouterId(int routerId) {        this.routerId = routerId;    }}