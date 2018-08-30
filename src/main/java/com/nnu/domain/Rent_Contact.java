package com.nnu.domain;

import java.util.Date;

public class Rent_Contact {
    private Integer contactid;

    private String department;

    private String contacts;

    private String phonenumber;

    private String companycategory;

    private Integer floor;

    private Integer room;

    private Double area;

    private Date starttime;

    private Date endtime;

    private Date paytime;

    private Double perprice;

    private Double deposit;

    private Date uptime;

    private Double waterprice;

    private Double elecprice;

    private String remark;

    private Integer workerid1;

    private Integer workerid2;

    private Integer propertynum;

    private String address;

    private Double registeredcapital;

    private Date registereddate;

    private String businessarea;

    private String legalperson;

    private Integer state;

    private Byte ifscanfileupload;

    private Byte ifcompanyinfoupload;

    public Integer getContactid() {
        return contactid;
    }

    public void setContactid(Integer contactid) {
        this.contactid = contactid;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public String getCompanycategory() {
        return companycategory;
    }

    public void setCompanycategory(String companycategory) {
        this.companycategory = companycategory == null ? null : companycategory.trim();
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public Double getPerprice() {
        return perprice;
    }

    public void setPerprice(Double perprice) {
        this.perprice = perprice;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    public Double getWaterprice() {
        return waterprice;
    }

    public void setWaterprice(Double waterprice) {
        this.waterprice = waterprice;
    }

    public Double getElecprice() {
        return elecprice;
    }

    public void setElecprice(Double elecprice) {
        this.elecprice = elecprice;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getWorkerid1() {
        return workerid1;
    }

    public void setWorkerid1(Integer workerid1) {
        this.workerid1 = workerid1;
    }

    public Integer getWorkerid2() {
        return workerid2;
    }

    public void setWorkerid2(Integer workerid2) {
        this.workerid2 = workerid2;
    }

    public Integer getPropertynum() {
        return propertynum;
    }

    public void setPropertynum(Integer propertynum) {
        this.propertynum = propertynum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Double getRegisteredcapital() {
        return registeredcapital;
    }

    public void setRegisteredcapital(Double registeredcapital) {
        this.registeredcapital = registeredcapital;
    }

    public Date getRegistereddate() {
        return registereddate;
    }

    public void setRegistereddate(Date registereddate) {
        this.registereddate = registereddate;
    }

    public String getBusinessarea() {
        return businessarea;
    }

    public void setBusinessarea(String businessarea) {
        this.businessarea = businessarea == null ? null : businessarea.trim();
    }

    public String getLegalperson() {
        return legalperson;
    }

    public void setLegalperson(String legalperson) {
        this.legalperson = legalperson == null ? null : legalperson.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Byte getIfscanfileupload() {
        return ifscanfileupload;
    }

    public void setIfscanfileupload(Byte ifscanfileupload) {
        this.ifscanfileupload = ifscanfileupload;
    }

    public Byte getIfcompanyinfoupload() {
        return ifcompanyinfoupload;
    }

    public void setIfcompanyinfoupload(Byte ifcompanyinfoupload) {
        this.ifcompanyinfoupload = ifcompanyinfoupload;
    }
}