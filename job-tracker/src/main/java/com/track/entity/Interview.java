package com.track.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "interview")
public class Interview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "candidate_id", nullable = false, insertable = false, updatable = false)
    private long candidateId;

    @Column(name = "company_id", nullable = false, insertable = false, updatable = false)
    private long companyId;

    @Column(name = "position_id", nullable = false, insertable = false, updatable = false)
    private long positionId;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "status", nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "candidate_id", nullable = false)
    private Candidate candidate;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    @ManyToOne
    @JoinColumn(name = "position_id", nullable = false)
    private Position position;

    public long getId() {
        return id;
    }

    public long getCandidateId() {
        return candidateId;
    }

    public long getCompanyId() {
        return companyId;
    }

    public long getPositionId() {
        return positionId;
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

    public Candidate getCandidate() {
        return candidate;
    }

    public Company getCompany() {
        return company;
    }

    public Position getPosition() {
        return position;
    }

}
