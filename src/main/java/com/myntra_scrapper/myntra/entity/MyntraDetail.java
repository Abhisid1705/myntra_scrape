package com.myntra_scrapper.myntra.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class MyntraDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String myntraUrl;
    private Double thresholdPrice;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
