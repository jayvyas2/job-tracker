package com.track.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "offer")
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @JsonProperty("position_id")
    @Column(name = "position_id", nullable = false, insertable = false, updatable = false)
    private long positionId;

    @JsonProperty("candidate_id")
    @Column(name = "candidate_id", nullable = false, insertable = false, updatable = false)
    private long candidateId;

    @Column(name = "status", nullable = false)
    private String status;

    @JsonProperty("cost_to_company")
    @Column(name = "cost_to_company", nullable = false)
    private String costToCompany;

    @ManyToOne
    @JoinColumn(name = "position_id", nullable = false)
    private Position position;

    @ManyToOne
    @JoinColumn(name = "candidate_id", nullable = false)
    private Candidate candidate;

    public long getId() {
        return id;
    }

    public long getPositionId() {
        return positionId;
    }

    public long getCandidateId() {
        return candidateId;
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

    public Position getPosition() {
        return position;
    }

    public Candidate getCandidate() {
        return candidate;
    }

}
