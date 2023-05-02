package com.example.electionmanagement.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.electionmanagement.models.Cred;

@Repository
public interface credrepo extends JpaRepository<Cred, Integer> {
    Cred findByuserId(int userId);
}
