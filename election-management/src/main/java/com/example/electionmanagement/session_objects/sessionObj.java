package com.example.electionmanagement.session_objects;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import com.example.electionmanagement.models.Admin;
import com.example.electionmanagement.models.Candidate;
import com.example.electionmanagement.models.Voter;
import org.springframework.context.annotation.ScopedProxyMode;

// @Component
// @Scope(value = "session")

// @SessionScope

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class sessionObj {
    private Voter v;
    private Candidate c;
    private Admin a;

    public Candidate getC() {
        return c;
    }

    public void setC(Candidate c) {
        this.c = c;
    }

    public Admin getA() {
        return a;
    }

    public void setA(Admin a) {
        this.a = a;
    }

    public Voter getV() {
        return v;
    }

    public void setV(Voter v) {
        this.v = v;
    }

    
}
