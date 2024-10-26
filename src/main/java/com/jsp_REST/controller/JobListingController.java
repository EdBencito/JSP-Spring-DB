package com.jsp_REST.controller;


import com.jsp_REST.model.JobListing;
import com.jsp_REST.service.JobListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/joblistings")

public class JobListingController {

    @Autowired
    private JobListingService  jobListingService;

    @GetMapping("/get/all")
    public List<JobListing> getAllJobListings(){
        return jobListingService.getAllJobListings();
    }

    @GetMapping("/get/{id}")
    public Optional<JobListing> getJobListingById(@PathVariable Long id) {
        return jobListingService.getJobListingById(id);
    }

    @PostMapping("/add")
    public JobListing addJobListing(@RequestBody JobListing jobListing) {
        return jobListingService.addJobListing(jobListing);
    }

    @PutMapping("/update/{id}")
    public JobListing updateJobListing(@PathVariable Long id, @RequestBody JobListing updatedJobListing) {
        return jobListingService.updateJobListing(id, updatedJobListing);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteJobListing(@PathVariable Long id) {
        jobListingService.deleteJobListing(id);
    }

}
