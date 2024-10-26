package com.jsp_REST.service;

import com.jsp_REST.model.JobListing;
import com.jsp_REST.repository.JobListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobListingService {

    @Autowired
    private JobListingRepository jobListingRepository;

    // Get all job listings
    public List<JobListing> getAllJobListings() {
        return jobListingRepository.findAll();
    }

    // Get job listing by ID
    public Optional<JobListing> getJobListingById(Long id) {
        return jobListingRepository.findById(id);
    }

    // Add a new job listing
    public JobListing addJobListing(JobListing jobListing) {
        return jobListingRepository.save(jobListing);
    }

    // Update an existing job listing
    public JobListing updateJobListing(Long id, JobListing updatedJobListing) {
        return jobListingRepository.findById(id)
                .map(jobListing -> {
                    // Only update fields if they are non-null in the updatedJobListing
                    if (updatedJobListing.getJobtitle() != null) {
                        jobListing.setJobtitle(updatedJobListing.getJobtitle());
                    }
                    if (updatedJobListing.getExperience() != null) {
                        jobListing.setExperience(updatedJobListing.getExperience());
                    }
                    if (updatedJobListing.getQualifications() != null) {
                        jobListing.setQualifications(updatedJobListing.getQualifications());
                    }
                    if (updatedJobListing.getSalaryrange() != null) {
                        jobListing.setSalaryrange(updatedJobListing.getSalaryrange());
                    }
                    if (updatedJobListing.getCity() != null) {
                        jobListing.setCity(updatedJobListing.getCity());
                    }
                    if (updatedJobListing.getCountry() != null) {
                        jobListing.setCountry(updatedJobListing.getCountry());
                    }
                    if (updatedJobListing.getWorktype() != null) {
                        jobListing.setWorktype(updatedJobListing.getWorktype());
                    }
                    if (updatedJobListing.getCompanysize() != null) {
                        jobListing.setCompanysize(updatedJobListing.getCompanysize());
                    }
                    if (updatedJobListing.getJobpostingdate() != null) {
                        jobListing.setJobpostingdate(updatedJobListing.getJobpostingdate());
                    }
                    if (updatedJobListing.getJobportal() != null) {
                        jobListing.setJobportal(updatedJobListing.getJobportal());
                    }
                    if (updatedJobListing.getJobdescription() != null) {
                        jobListing.setJobdescription(updatedJobListing.getJobdescription());
                    }
                    if (updatedJobListing.getBenefits() != null) {
                        jobListing.setBenefits(updatedJobListing.getBenefits());
                    }
                    if (updatedJobListing.getSkills() != null) {
                        jobListing.setSkills(updatedJobListing.getSkills());
                    }
                    if (updatedJobListing.getResponsibilities() != null) {
                        jobListing.setResponsibilities(updatedJobListing.getResponsibilities());
                    }
                    if (updatedJobListing.getCompany() != null) {
                        jobListing.setCompany(updatedJobListing.getCompany());
                    }

                    // Save and return the updated job listing
                    return jobListingRepository.save(jobListing);
                })
                .orElse(null); // Handle not found case
    }

    // Delete a job listing by ID
    public void deleteJobListing(Long id) {
        jobListingRepository.deleteById(id);
    }
}
