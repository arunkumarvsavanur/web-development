package com.jobBoard.jobBoard.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "company")
public class JobBoardCompany {
    @Id
    @GeneratedValue
    private String id;
    private String company_name;
    private String company_type;
    private String company_founded_on;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id",referencedColumnName = "id")
    List<JobBoardJobs> jobList=new ArrayList<>();


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_type() {
        return company_type;
    }

    public void setCompany_type(String company_type) {
        this.company_type = company_type;
    }

    public String getCompany_founded_on() {
        return company_founded_on;
    }

    public void setCompany_founded_on(String company_founded_on) {
        this.company_founded_on = company_founded_on;
    }

    public List<JobBoardJobs> getJobList() {
        return jobList;
    }

    public void setJobList(List<JobBoardJobs> jobList) {
        this.jobList = jobList;
    }

    public JobBoardCompany(String id, String company_name, String company_type, String company_founded_on, List<JobBoardJobs> jobList) {
        this.id = id;
        this.company_name = company_name;
        this.company_type = company_type;
        this.company_founded_on = company_founded_on;
    }

    public JobBoardCompany() {
    }
}
