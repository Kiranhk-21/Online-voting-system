package com.example.electionmanagement.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CandidateDetails")
public class CandidateDetails {

    @Id
    String name;

    @Column
    int userId;
    
    @Column
    String cid;

    public CandidateDetails(){}
    

    public CandidateDetails(String name, int userId, String cid) {
        this.name = name;
        this.userId = userId;
        this.cid = cid;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCid() {
        return cid;
    }
    public void setCid(String cid) {
        this.cid = cid;
    }


    public int getUserId() {
        return userId;
    }


    public void setUserId(int userId) {
        this.userId = userId;
    }
}
