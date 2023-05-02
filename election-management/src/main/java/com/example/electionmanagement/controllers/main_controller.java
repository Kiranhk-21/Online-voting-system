package com.example.electionmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.electionmanagement.models.Admin;
import com.example.electionmanagement.models.Candidate;
import com.example.electionmanagement.models.CandidateDetails;
import com.example.electionmanagement.models.Cred;
import com.example.electionmanagement.models.Voter;
import com.example.electionmanagement.models.VoterDetails;
import com.example.electionmanagement.services.candidateops;
import com.example.electionmanagement.services.credops;
import com.example.electionmanagement.services.voterops;
import com.example.electionmanagement.session_objects.sessionObj;

@Controller
public class main_controller {
    public Voter v;
    public Candidate ca;
    public Admin a;

    @Autowired
    private sessionObj sess;

    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public String showHome(){
        System.out.println("home is working");
        sess.setV(null);
        sess.setA(null);
        sess.setC(null);
        return "home.html";
    }

    @GetMapping(value = "/login")
    public String show_login(){
        System.out.println("login is working");
        return "login";
    }

    @Autowired
    credops co ;

    @Autowired
    private voterops vo;

    @Autowired
    private candidateops cao;
    

    @PostMapping(value = "/login")
    public String provide_login_cred(@RequestParam("userId") int userId,@RequestParam("pswd") String pswd,@RequestParam("type") String type){
        System.out.println("entered login post");
        Cred c = new Cred(userId,pswd,type);
        if(co.check_valid_creds(c)){
            if(type.equals("voter")){
                VoterDetails vd = vo.get_voterbyuserId(userId);
                v = new Voter(userId,vd.getName(),vd.getVoterId());
                sess.setV(v);
                return "redirect:/voter";
            }
            else if(type.equals("candidate")){
                CandidateDetails cd = cao.get_candidatebyuserId(userId);
                ca = new Candidate(userId, cd.getName(), cd.getCid());
                sess.setC(ca);
                return "redirect:/candidate";
            }
            else if(type.equals("admin")){
                return "redirect:/admin";
            }
            else{
                return "error.html";
            }
        }
        else{
            return "login";
        }
    }

    @PostMapping(value = "/register")
    public String account_create(@RequestParam("userId") int userId,@RequestParam("pswd") String pswd,@RequestParam("name") String name,@RequestParam("type") String type,@RequestParam("electionId") String electionId){
        System.out.println("***************");
        System.out.println(userId);
        System.out.println(pswd);
        System.out.println(type);
        System.out.println(co);

        System.out.println("***************");
        if(co.check_username_presence(userId)){
            co.create_cred(new Cred(userId,pswd,type));
            if(type.equals("voter")){
                VoterDetails e = new VoterDetails(electionId, name, userId);
                vo.create_voter(e);
            }
            else if(type.equals("candidate")){
                CandidateDetails e = new CandidateDetails(name, userId, electionId);
                cao.create_candidate(e);
            }
            else if(type.equals("Admin")){

            }
            return "login";
            
        }
        else{
            return "register";
        }
    }


    @GetMapping(value = "/admin")
    public String showadmin(){
        return "admin";
    }
    

    @GetMapping(value = "/register")
    public String showregister(){
        return "register";
    }
}
