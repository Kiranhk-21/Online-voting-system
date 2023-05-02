package com.example.electionmanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.electionmanagement.models.CandidateDetails;
import com.example.electionmanagement.repos.candidaterepo;

@Service
public class candidateops {
    @Autowired
    private candidaterepo cr;

    public CandidateDetails create_candidate(CandidateDetails e) {
        return cr.save(e);
    }

    public CandidateDetails get_candidatebycandidateId(String cid){
        return cr.findByCid(cid);
    }

    public CandidateDetails get_candidatebyuserId(int userId){
        return cr.findByUserId(userId);
    }
}
