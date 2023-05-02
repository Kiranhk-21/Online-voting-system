package com.example.electionmanagement.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Repository;

import com.example.electionmanagement.models.VoterDetails;

@Repository
public interface voterrepo extends JpaRepository<VoterDetails,String> {
    VoterDetails findByVoterId(String voterId);
    VoterDetails findByUserId(int userId);
}
