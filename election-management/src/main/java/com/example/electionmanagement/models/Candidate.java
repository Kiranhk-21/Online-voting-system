package com.example.electionmanagement.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.electionmanagement.services.proxy_electionops;

public class Candidate extends User{
    String cid;
    

    public String getCid() {
        return cid;
    }
    public void setCid(String cid) {
        this.cid = cid;
    }
    public Candidate(){

    }
    public Candidate(int userId, String name,String cid){
        super(userId,name);
        this.cid = cid;
    }

    @Autowired
    private proxy_electionops peo;

    @Override
    List<Election> get_electionList() {
        List<Election> et= peo.getAllElections();
        return et;
    }
    
}
