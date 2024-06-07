package com.myntra_scrapper.myntra.dto;

public class MyntraDetailDAO {
    private String email;
    private String myntraUrl;
    private Double thresholdPrice;

    // Getters and setters

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMyntraUrl() {
        return myntraUrl;
    }

    public void setMyntraUrl(String myntraUrl) {
        this.myntraUrl = myntraUrl;
    }

    public Double getThresholdPrice() {
        return thresholdPrice;
    }

    public void setThresholdPrice(Double thresholdPrice) {
        this.thresholdPrice = thresholdPrice;
    }
}
