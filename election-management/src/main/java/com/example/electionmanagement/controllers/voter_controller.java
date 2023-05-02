package com.example.electionmanagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.electionmanagement.models.Stander;
import com.example.electionmanagement.models.VoterDetails;
import com.example.electionmanagement.repos.standerepo;
import com.example.electionmanagement.services.standerops;
import com.example.electionmanagement.services.voterops;
import com.example.electionmanagement.session_objects.sessionObj;

import ch.qos.logback.core.model.Model;

@Controller
public class voter_controller{

    @Autowired
    private sessionObj sess;

    @Autowired
    private voterops vo;

    @GetMapping(value = "/voter")
    public ModelAndView showvoter(){
        ModelAndView mv = new ModelAndView();
        VoterDetails vd = vo.get_voterbyuserId(sess.getV().getUserId());
        mv.addObject("voter_d",vd);
        mv.setViewName("voter");
        return mv;
    }

    @Autowired
    private standerops so;

    @PostMapping(value = "/voter/candidate_view")
    public ModelAndView handle_candidate_view(@RequestParam("eid") int eid){
        ModelAndView mv = new ModelAndView();
        List<Stander> table_t= so.getAllStanders_inElection(eid);
        mv.addObject("candidates_l",table_t);
        mv.setViewName("check_candidates");
        return mv;
    }

    @PostMapping(value = "/voter/cast_vote")
    public void cast_vote_to(@RequestParam("eid") int eid , @RequestParam("cid") String cid){
        List<Stander> sl = so.getStander_cid_eid(cid, eid);
        Stander s = sl.get(0);
        int votes = s.getVotes();
        votes += 1;
        s.setVotes(votes);
        so.createStander(s);
    }
}
