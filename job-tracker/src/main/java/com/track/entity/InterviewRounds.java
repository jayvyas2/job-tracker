package com.track.entity;

import javax.persistence.*;

@Entity
@Table(name = "interview_rounds")
public class InterviewRounds {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "interview_id", nullable = false, insertable = false, updatable = false)
    private long interviewId;

    @Column(name = "interviewer_name", nullable = false)
    private String interviewerName;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "feedback")
    private String feedback;

    @ManyToOne
    @JoinColumn(name = "interview_id", nullable = false)
    private Interview interview;

    public long getId() {
        return id;
    }

    public long getInterviewId() {
        return interviewId;
    }

    public String getInterviewerName() {
        return interviewerName;
    }

    public void setInterviewerName(String interviewerName) {
        this.interviewerName = interviewerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Interview getInterview() {
        return interview;
    }

}
