package com.example.electionmanagement.models;

import java.util.List;

import com.example.electionmanagement.services.full_electionops;


public class Admin extends User{
    String AdminId;
    public Admin(){}
    public Admin(int userId, String name,String AdminId){
        super(userId, name);
        this.AdminId = AdminId;
    }

    private full_electionops eo;

    @Override
    List<Election> get_electionList() {
        List<Election> et= eo.getAllElections();
        return et;
    }

    Election get_election_with_id(int id){
        return eo.getElectionById(id);
    }

    Election createElection(Election e){
        return eo.createElection(e);
    }

    void deleteElection(int id){
        eo.deleteElection(id);
    }  



    
}
