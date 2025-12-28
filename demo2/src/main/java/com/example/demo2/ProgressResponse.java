package com.example.demo2;

import java.math.BigDecimal;

public class ProgressResponse {
    private BigDecimal height;
    private BigDecimal weight;
    private BigDecimal headCircunference;
    private String dateProgress;

    public ProgressResponse(BigDecimal height, BigDecimal weight, BigDecimal headCircunference, String dateProgress) {
        this.height = height;
        this.weight = weight;
        this.headCircunference = headCircunference;
        this.dateProgress = dateProgress;
    }

    // Getters e Setters
    public BigDecimal getHeight() { return height; }
    public void setHeight(BigDecimal height) { this.height = height; }

    public BigDecimal getWeight() { return weight; }
    public void setWeight(BigDecimal weight) { this.weight = weight; }

    public BigDecimal getHeadCircunference() { return headCircunference; }
    public void setHeadCircunference(BigDecimal headCircunference) { this.headCircunference = headCircunference; }

    public String getDateProgress() { return dateProgress; }
    public void setDateProgress(String dateProgress) { this.dateProgress = dateProgress; }
}