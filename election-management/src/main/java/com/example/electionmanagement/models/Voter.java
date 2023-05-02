package com.example.electionmanagement.models;

import java.util.List;

import com.example.electionmanagement.services.proxy_electionops;

public class Voter extends User{
    String VoterId;

    public String getVoterId() {
        return VoterId;
    }
    public void setVoterId(String voterId) {
        VoterId = voterId;
    }
    public Voter(){}
    public Voter(int userId, String name, String voterId) {
        super(userId, name);
        VoterId = voterId;
    }

    private proxy_electionops peo;

    @Override
    List<Election> get_electionList() {
        List<Election> et= peo.getAllElections();
        return et;
    }

}
