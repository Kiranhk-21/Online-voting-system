package com.example.electionmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.electionmanagement.models.Election;

@Service
public class proxy_electionops {
    @Autowired
    private full_electionops feo;

    public List<Election> getAllElections() {
        return feo.getAllElections();
    }
    
    public Election getElectionById(int id) {
        return feo.getElectionById(id);
    }
}
