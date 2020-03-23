package com.track.entity;

import javax.persistence.*;

@Entity
@Table(name = "position ")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "minimum_experience", nullable = false)
    private int minimumExperience;

    @Column(name = "maximum_experience")
    private int maximumExperience;

    @Column(name = "description")
    private String description;

    @Column(name = "minimum_salary")
    private String minimumSalary;

    @Column(name = "maximum_salary")
    private String maximumSalary;

    @Column(name = "number_of_openings", nullable = false)
    private int noOfOpening;

    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    @Column(name = "company_id", nullable = false, insertable = false, updatable = false)
    private long company_id;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Company getCompany() {
        return company;
    }

    public long getCompany_id() {
        return company_id;
    }

}
