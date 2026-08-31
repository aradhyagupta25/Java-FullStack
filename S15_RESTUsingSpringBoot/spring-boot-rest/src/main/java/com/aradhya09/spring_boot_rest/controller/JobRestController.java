package com.aradhya09.spring_boot_rest.controller;

import com.aradhya09.spring_boot_rest.model.JobPost;
import com.aradhya09.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins ="http://localhost:3000")
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("jobPosts")
//    @ResponseBody
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    }

//    @PostMapping
//    public void addJob(@PathVariable JobPost post) {
//        return
//    }
}
