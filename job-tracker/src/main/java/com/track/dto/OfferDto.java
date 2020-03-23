package com.track.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;

public class OfferDto {

    private long id;

    @JsonProperty("position_id")
    private long positionId;

    @JsonProperty("position_name")
    private String positionName;

    @JsonProperty("candidate_id")
    private long candidateId;

    @JsonProperty("candidate_name")
    private String candidateName;

    @Column(name = "status", nullable = false)
    private String status;

    @JsonProperty("cost_to_company")
    private String costToCompany;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPositionId() {
        return positionId;
    }

    public void setPositionId(long positionId) {
        this.positionId = positionId;
    }

    public long getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(long candidateId) {
        this.candidateId = candidateId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCostToCompany() {
        return costToCompany;
    }

    public void setCostToCompany(String costToCompany) {
        this.costToCompany = costToCompany;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }
}
