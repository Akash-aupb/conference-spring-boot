package com.globalmatics.bike.model;

import java.math.BigDecimal;
import java.util.Date;

public class Bike {
    private String name;
    private String email;
    private String phone;
    private String model;
    private String serialNumber;
    private BigDecimal purchagePrice;
    private Date purchageDate;
    private Boolean contact;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public BigDecimal getPurchagePrice() {
        return purchagePrice;
    }

    public void setPurchagePrice(BigDecimal purchagePrice) {
        this.purchagePrice = purchagePrice;
    }

    public Date getPurchageDate() {
        return purchageDate;
    }

    public void setPurchageDate(Date purchageDate) {
        this.purchageDate = purchageDate;
    }

    public Boolean getContact() {
        return contact;
    }

    public void setContact(Boolean contact) {
        this.contact = contact;
    }


}
