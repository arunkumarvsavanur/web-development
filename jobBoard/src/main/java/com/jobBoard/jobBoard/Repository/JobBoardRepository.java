package com.jobBoard.jobBoard.Repository;

import com.jobBoard.jobBoard.Entity.JobBoardCompany;
import com.jobBoard.jobBoard.Entity.JobRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobBoardRepository extends JpaRepository<JobBoardCompany,String> {

}
