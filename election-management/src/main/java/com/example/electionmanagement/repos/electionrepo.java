package com.example.electionmanagement.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.electionmanagement.models.Election;

@Repository
public interface electionrepo extends JpaRepository<Election,Integer>{}
