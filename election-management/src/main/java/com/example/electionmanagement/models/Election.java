package com.example.electionmanagement.models;

// import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Election")
public class Election {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    int eid;
    @Column(length = 255)
    String ename;
    @Column(length = 255)
    String ewinner;
    @Column
    int eyear;

    public Election() {}
    public Election(int eid, String ename, String ewinner, int eyear) {
        this.eid = eid;
        this.ename = ename;
        this.ewinner = ewinner;
        this.eyear = eyear;
    }

    

    @Override
    public String toString() {
        return "Election [eid=" + eid + ", ename=" + ename + ", ewinner=" + ewinner + ", eyear=" + eyear + "]";
    }

    

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEwinner() {
        return ewinner;
    }

    public void setEwinner(String ewinner) {
        this.ewinner = ewinner;
    }

    public int getEyear() {
        return eyear;
    }

    public void setEyear(int eyear) {
        this.eyear = eyear;
    }


     
}
