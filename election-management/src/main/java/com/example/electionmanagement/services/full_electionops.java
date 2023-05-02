package com.example.electionmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.electionmanagement.models.Election;
import com.example.electionmanagement.repos.electionrepo;

@Service
public class full_electionops {
    @Autowired
    private electionrepo er;
    public List<Election> getAllElections() {
        return er.findAll();
    }
    
    public Election getElectionById(int id) {
        return er.findById(id).orElse(null);
    }
    
    public Election createElection(Election e) {
        return er.save(e);
    }
    
    public void deleteElection(int id) {
        er.deleteById(id);
    }
    
}
