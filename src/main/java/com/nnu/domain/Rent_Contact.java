package com.nnu.domain;

/**
 * @Author shisj
 * @Date: 2018/8/14 11:47
 */

import java.util.Date;

public class Rent_Contact {

    /*
    招商部
     */
    private String contactId;
    private String department;//租赁单位
    private String contacts;//联系人
    private String phoneNumber;
    private String companyCategory;
    private int floor;
    private int room;
    private double area;
    private Date startTime;
    private Date endTime;
    private Date payTime;
    private double perPrice;
    private double deposit;
    private Date upTime;
    private double waterPrice;
    private double elecPrice;
    private int payInterval;
    private String remark;
    private int workerId1;

    /*
    办公室
     */
    private int workerId2;
    private int propertyNum;
    private String address;
    private double registeredCapital;
    private Date registeredDate;
    private String businessArea;
    private String legalPerson;


    private int state;//合同状态：0表示草稿状态、1表示未审核、2表示通过、3表示未通过、4表示到期或退租、5表示续租
    private boolean ifScanFileUpLoad;
    private boolean ifCompanyInfoUpload;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public boolean isIfScanFileUpLoad() {
        return ifScanFileUpLoad;
    }

    public void setIfScanFileUpLoad(boolean ifScanFileUpLoad) {
        this.ifScanFileUpLoad = ifScanFileUpLoad;
    }

    public boolean isIfCompanyInfoUpload() {
        return ifCompanyInfoUpload;
    }

    public void setIfCompanyInfoUpload(boolean ifCompanyInfoUpload) {
        this.ifCompanyInfoUpload = ifCompanyInfoUpload;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompanyCategory() {
        return companyCategory;
    }

    public void setCompanyCategory(String companyCategory) {
        this.companyCategory = companyCategory;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public double getPerPrice() {
        return perPrice;
    }

    public void setPerPrice(double perPrice) {
        this.perPrice = perPrice;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public Date getUpTime() {
        return upTime;
    }

    public void setUpTime(Date upTime) {
        this.upTime = upTime;
    }

    public double getWaterPrice() {
        return waterPrice;
    }

    public void setWaterPrice(double waterPrice) {
        this.waterPrice = waterPrice;
    }

    public double getElecPrice() {
        return elecPrice;
    }

    public void setElecPrice(double elecPrice) {
        this.elecPrice = elecPrice;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getWorkerId1() {
        return workerId1;
    }

    public void setWorkerId1(int workerId1) {
        this.workerId1 = workerId1;
    }

    public int getWorkerId2() {
        return workerId2;
    }

    public void setWorkerId2(int workerId2) {
        this.workerId2 = workerId2;
    }

    public int getPropertyNum() {
        return propertyNum;
    }

    public void setPropertyNum(int propertyNum) {
        this.propertyNum = propertyNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(double registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }

    public String getBusinessArea() {
        return businessArea;
    }

    public void setBusinessArea(String businessArea) {
        this.businessArea = businessArea;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public int getPayInterval() {
        return payInterval;
    }

    public void setPayInterval(int payInterval) {
        this.payInterval = payInterval;
    }
}

