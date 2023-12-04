package com.jobBoard.jobBoard.Repository;

import com.jobBoard.jobBoard.Entity.JobRegistration;
import org.springframework.data.jpa.repository.JpaRepository;


public interface JobRegistrationRepository extends JpaRepository<JobRegistration,Integer> {
}
