package com.example.electionmanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.electionmanagement.models.Cred;
import com.example.electionmanagement.repos.credrepo;

@Service
public class credops {
    @Autowired
    credrepo cr ;

    public boolean check_valid_creds(Cred c){
        int id = c.getUserId();
        Cred cl =  cr.findByuserId(id);

        if(cl == null){
            System.out.println("returning false1");
            return false;
        }

        if(cl.getPswd().equals(c.getPswd())){
            System.out.println("returning true");
            return true;
        }
        else{
            System.out.println("returning false2");
            return false;
        }
    }

    public boolean check_username_presence(int userId){
        Cred cl = cr.findByuserId(userId);
        System.out.println(cl);
        System.out.println("**********");
        if(cl == null){
            return true;
        }
        else{
            return false;
        }
    }

    public Cred create_cred(Cred e) {
        return cr.save(e);
    }
    
    public Cred find_cred(int userId){
        Cred cl = cr.findByuserId(userId);
        return cl;
    }
}


// @Service
// class credService {
//     @Autowired
//     private credrepo myEntityRepository;

//     public Cred findByuserId(String id, Cred defaultEntity) {
//         return myEntityRepository.findByuserId(id)
//                 .orElse(defaultEntity);
//     }
// }