package com.shubham.viewservice.controllers;

import com.shubham.viewservice.dtos.JobDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping()
    public ResponseEntity<List<JobDto>> getAllJobs() {
        JobDto jobDto = JobDto.builder().title("first job").timestamp(new Date()).build();
        return new ResponseEntity<>(Arrays.asList(jobDto), HttpStatus.OK);
    }
}
