package com.example.electionmanagement.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "VoterDetails")
public class VoterDetails {
    @Id
    String voterId;

    @Column
    String name;

    @Column
    int userId;

    public VoterDetails(){}
    public VoterDetails(String voterId, String name, int userId) {
        this.voterId = voterId;
        this.name = name;
        this.userId = userId;
    }

    

    public String getVoterId() {
        return voterId;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


}
