package com.example.electionmanagement.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Repository;

import com.example.electionmanagement.models.CandidateDetails;
import com.example.electionmanagement.models.VoterDetails;

@Repository
public interface candidaterepo extends JpaRepository<CandidateDetails,String> {
    CandidateDetails findByCid(String cid);
    CandidateDetails findByUserId(int userId);
}
