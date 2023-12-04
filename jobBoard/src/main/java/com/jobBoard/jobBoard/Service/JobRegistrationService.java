package com.jobBoard.jobBoard.Service;

import com.jobBoard.jobBoard.Entity.JobRegistration;
import com.jobBoard.jobBoard.Repository.JobRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobRegistrationService {
    @Autowired
    private JobRegistrationRepository jobRegistrationRepository;

    public JobRegistration saveRegistrationDetails(JobRegistration jobRegistration){
        return jobRegistrationRepository.save(jobRegistration);
    }
}
