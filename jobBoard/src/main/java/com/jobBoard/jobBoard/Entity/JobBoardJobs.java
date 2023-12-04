package com.jobBoard.jobBoard.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "job")
public class JobBoardJobs {

    @Id
    private String id;
    private String job_name;
    private String job_level;
    private String job_function;
    private String employment_level;
    private String job_location;
    private String job_salary;
    private String education_required_job;
    private String job_needs;

    public JobBoardJobs(String id, String job_name, String job_level, String job_function, String employment_level, String job_location, String job_salary, String education_required_job, String job_needs) {
        this.id = id;
        this.job_name = job_name;
        this.job_level = job_level;
        this.job_function = job_function;
        this.employment_level = employment_level;
        this.job_location = job_location;
        this.job_salary = job_salary;
        this.education_required_job = education_required_job;
        this.job_needs = job_needs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public String getJob_level() {
        return job_level;
    }

    public void setJob_level(String job_level) {
        this.job_level = job_level;
    }

    public String getJob_function() {
        return job_function;
    }

    public void setJob_function(String job_function) {
        this.job_function = job_function;
    }

    public String getEmployment_level() {
        return employment_level;
    }

    public void setEmployment_level(String employment_level) {
        this.employment_level = employment_level;
    }

    public String getJob_location() {
        return job_location;
    }

    public void setJob_location(String job_location) {
        this.job_location = job_location;
    }

    public String getJob_salary() {
        return job_salary;
    }

    public void setJob_salary(String job_salary) {
        this.job_salary = job_salary;
    }

    public String getEducation_required_job() {
        return education_required_job;
    }

    public void setEducation_required_job(String education_required_job) {
        this.education_required_job = education_required_job;
    }

    public String getJob_needs() {
        return job_needs;
    }

    public void setJob_needs(String job_needs) {
        this.job_needs = job_needs;
    }

    public JobBoardJobs() {
    }
}
