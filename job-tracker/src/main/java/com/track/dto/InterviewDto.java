package com.track.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Date;

public class InterviewDto {

    @JsonProperty("id")
    private long id;

    @JsonProperty("company_id")
    private long companyId;

    @JsonProperty("comapany_name")
    private String companyName;

    @JsonProperty("position_id")
    private long positionId;

    @JsonProperty("position_name")
    private String positionName;

    @JsonProperty("date")
    private Date date;

    @JsonProperty("status")
    private String status;

    @JsonProperty("round_status")
    private String roundStatus;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public long getPositionId() {
        return positionId;
    }

    public void setPositionId(long positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRoundStatus() {
        return roundStatus;
    }

    public void setRoundStatus(String roundStatus) {
        this.roundStatus = roundStatus;
    }
}
