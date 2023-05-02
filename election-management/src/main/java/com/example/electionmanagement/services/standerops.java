package com.example.electionmanagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.electionmanagement.models.Stander;
import com.example.electionmanagement.repos.standerepo;

@Service
public class standerops {

    @Autowired
    private standerepo sr;

    public List<Stander> getAllStanders(){
        return sr.findAll();
    }

    public Stander getStanderById(int reg_id) {
        return sr.findById(reg_id).orElse(null);
    }

    public Stander createStander(Stander e) {
        return sr.save(e);
    }

    public void deleteStander(int reg_id) {
        sr.deleteById(reg_id);
    }

    public List<Stander> getAllStanders_inElection(int eid){
        return sr.findByEid(eid);
    }

    public List<Stander> getStander_cid_eid(String cid,int eid){
        return sr.findByCidAndEid(cid,eid);
    }

}
