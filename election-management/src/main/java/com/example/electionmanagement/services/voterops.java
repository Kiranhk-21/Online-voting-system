package com.example.electionmanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.electionmanagement.models.VoterDetails;
import com.example.electionmanagement.repos.voterrepo;

@Service
public class voterops {
    @Autowired
    private voterrepo vr;

    public VoterDetails create_voter(VoterDetails e) {
        return vr.save(e);
    }

    public VoterDetails get_voterbyVoterId(String VoterId){
        return vr.findByVoterId(VoterId);
    }

    public VoterDetails get_voterbyuserId(int userId){
        return vr.findByUserId(userId);
    }
}
