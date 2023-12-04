package com.jobBoard.jobBoard.Service;

import com.jobBoard.jobBoard.Entity.JobBoardCompany;
import com.jobBoard.jobBoard.Entity.JobRegistration;
import com.jobBoard.jobBoard.Repository.JobBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobBoardService {

    @Autowired
    public JobBoardRepository jobBoardRepository;

    public List<JobBoardCompany> findAllJobs() {
        return jobBoardRepository.findAll();
    }

    public List<JobBoardCompany> getCompanies() {
        return jobBoardRepository.findAll();
    }
}
