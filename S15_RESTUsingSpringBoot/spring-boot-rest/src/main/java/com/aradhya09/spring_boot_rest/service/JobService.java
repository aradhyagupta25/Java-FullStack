package com.aradhya09.spring_boot_rest.service;

import com.aradhya09.spring_boot_rest.model.JobPost;
import com.aradhya09.spring_boot_rest.repo.JopRepo;
import com.aradhya09.spring_boot_rest.repo.JopRepo;
import com.aradhya09.spring_boot_rest.repo.JopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    public JopRepo repo;

    // return all job posts
    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();
    }

    // add a job
    public void addJobPost(JobPost jobPost) {
        repo.addJobPosts(jobPost);
    }

}
