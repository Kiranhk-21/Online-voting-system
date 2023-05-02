package com.example.electionmanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.electionmanagement.models.Candidate;
// import com.example.electionmanagement.models.Candidate_details;
import com.example.electionmanagement.session_objects.sessionObj;

@Controller
public class candidate_controller {
    
    @Autowired
    private sessionObj sess;

    @GetMapping(value = "/candidate")
    public ModelAndView showcandidate(){
        ModelAndView mv = new ModelAndView();
        Candidate c = sess.getC();
        System.out.println("************");
        System.out.println(c.getCid());
        System.out.println(c.getCid().getClass());
        System.out.println(c.getName());
        System.out.println(c.getName().getClass());
        System.out.println(c.getUserId());
        
        System.out.println("************");
        // Candidate cd = new Candidate();
        mv.addObject("candidate_d", c);
        mv.setViewName("candidate");
        return mv;
        // return "candidate";
    }


}
