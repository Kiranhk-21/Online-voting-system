package com.example.electionmanagement.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cred")
public class Cred {
    @Id
    int userId;

    @Column(length = 255)
    String pswd;

    @Column
    String type;


    

    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }




    public Cred() {
    }


    public Cred(int userId, String pswd, String type) {
        this.userId = userId;
        this.pswd = pswd;
        this.type = type;
    }



    @Override
    public String toString() {
        return "Cred [userId=" + userId + ", pswd=" + pswd + ", type=" + type + "]";
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }


    public Cred orElse(Cred defaultEntity) {
        return null;
    }

}
