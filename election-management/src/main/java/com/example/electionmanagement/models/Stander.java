package com.example.electionmanagement.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Stander")
public class Stander {
    @Id
    int reg_id;

    @Column
    String cid;
    
    @Column
    int eid;

    @Column
    int votes;

    @Override
    public String toString() {
        return "Stander [reg_id=" + reg_id + ", cid=" + cid + ", eid=" + eid + ", votes=" + votes + "]";
    }
    public Stander(){}
    public Stander(int reg_id, String cid, int eid, int votes) {
        this.reg_id = reg_id;
        this.cid = cid;
        this.eid = eid;
        this.votes = votes;
    }

    public int getReg_id() {
        return reg_id;
    }

    public void setReg_id(int reg_id) {
        this.reg_id = reg_id;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }


}
