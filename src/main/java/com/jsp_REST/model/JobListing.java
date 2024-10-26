package com.jsp_REST.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "joblistings")
//@Table(name = "tdb")
public class JobListing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobid;

    @Column(name = "experience", nullable = false)
    private String experience;

    @Column(name = "qualifications", nullable = false)
    private String qualifications;

    @Column(name = "salaryrange", nullable = false)
    private String salaryrange;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "worktype", nullable = false)
    private String worktype;

    @Column(name = "companysize", nullable = false)
    private Integer companysize;

    @Column(name = "jobpostingdate", nullable = false)
    private LocalDate jobpostingdate;

    @Column(name = "jobtitle", nullable = false)
    private String jobtitle;

    @Column(name = "jobportal", nullable = false)
    private String jobportal;

    @Column(name = "jobdescription", nullable = false, length = 512)
    private String jobdescription;

    @Column(name = "benefits", nullable = false)
    private String benefits;

    @Column(name = "skills", nullable = false, length = 512)
    private String skills;

    @Column(name = "responsibilities", nullable = false)
    private String responsibilities;

    @Column(name = "company", nullable = false)
    private String company;

    //    Constructors
    public JobListing() {
    }

    public JobListing(Long jobid, String experience, String qualifications, String salaryrange, String city, String country,
                      String worktype, Integer companysize, LocalDate jobpostingdate, String jobtitle, String jobportal,
                      String jobdescription, String benefits, String skills, String responsibilities, String company) {
        this.jobid = jobid;
        this.experience = experience;
        this.qualifications = qualifications;
        this.salaryrange = salaryrange;
        this.city = city;
        this.country = country;
        this.worktype = worktype;
        this.companysize = companysize;
        this.jobpostingdate = jobpostingdate;
        this.jobtitle = jobtitle;
        this.jobportal = jobportal;
        this.jobdescription = jobdescription;
        this.benefits = benefits;
        this.skills = skills;
        this.responsibilities = responsibilities;
        this.company = company;
    }

//    Getters and Setters


    public Long getJobid() {
        return jobid;
    }

    public void setJobid(Long jobid) {
        this.jobid = jobid;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getSalaryrange() {
        return salaryrange;
    }

    public void setSalaryrange(String salaryrange) {
        this.salaryrange = salaryrange;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getWorktype() {
        return worktype;
    }

    public void setWorktype(String worktype) {
        this.worktype = worktype;
    }

    public Integer getCompanysize() {
        return companysize;
    }

    public void setCompanysize(int companysize) {
        this.companysize = companysize;
    }

    public LocalDate getJobpostingdate() {
        return jobpostingdate;
    }

    public void setJobpostingdate(LocalDate jobpostingdate) {
        this.jobpostingdate = jobpostingdate;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getJobportal() {
        return jobportal;
    }

    public void setJobportal(String jobportal) {
        this.jobportal = jobportal;
    }

    public String getJobdescription() {
        return jobdescription;
    }

    public void setJobdescription(String jobdescription) {
        this.jobdescription = jobdescription;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
