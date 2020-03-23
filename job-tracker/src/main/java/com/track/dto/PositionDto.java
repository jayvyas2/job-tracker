package com.track.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PositionDto {

    @JsonProperty("position_id")
    private long id;

    @JsonProperty("title")
    private String positionTitle;

    @JsonProperty("minimum_experience")
    private int minimumExperience;

    @JsonProperty("maximum_experience")
    private int maximumExperience;

    private String description;

    @JsonProperty("minimum_salary")
    private String minimumSalary;

    @JsonProperty("maximum_salary")
    private String maximumSalary;

    @JsonProperty("number_of_opening")
    private int noOfOpening;

    @JsonProperty("company_id")
    private long companyId;

    @JsonProperty("company_name")
    private String companyName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public int getMinimumExperience() {
        return minimumExperience;
    }

    public void setMinimumExperience(int minimumExperience) {
        this.minimumExperience = minimumExperience;
    }

    public int getMaximumExperience() {
        return maximumExperience;
    }

    public void setMaximumExperience(int maximumExperience) {
        this.maximumExperience = maximumExperience;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMinimumSalary() {
        return minimumSalary;
    }

    public void setMinimumSalary(String minimumSalary) {
        this.minimumSalary = minimumSalary;
    }

    public String getMaximumSalary() {
        return maximumSalary;
    }

    public void setMaximumSalary(String maximumSalary) {
        this.maximumSalary = maximumSalary;
    }

    public int getNoOfOpening() {
        return noOfOpening;
    }

    public void setNoOfOpening(int noOfOpening) {
        this.noOfOpening = noOfOpening;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
