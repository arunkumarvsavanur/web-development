package com.jobBoard.jobBoard.Controller;

import com.jobBoard.jobBoard.Entity.JobBoardCompany;
import com.jobBoard.jobBoard.Entity.JobRegistration;
import com.jobBoard.jobBoard.Service.JobBoardService;
import com.jobBoard.jobBoard.Service.JobRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class jobList {

    @Autowired
    private JobRegistrationService jobRegistrationService;
    @Autowired
    private JobBoardService jobBoardService;
    @PostMapping(value = "addRegister")
    public String addRegistrationDetails(@RequestBody JobRegistration jobRegistration){
        jobRegistrationService.saveRegistrationDetails(jobRegistration);
        return "jobApp";
    }
//    @GetMapping("/getCompany")
//    public List<JobBoardCompany> findCompany(){
//        return jobBoardService.findAllJobs();
//    }

    @RequestMapping(value ="/getCompany",method = RequestMethod.GET)
    public ResponseEntity<Object> getCompanies(){
        List<JobBoardCompany> companyList=jobBoardService.getCompanies();
        return new ResponseEntity<>(companyList, HttpStatus.OK);
    }
}
