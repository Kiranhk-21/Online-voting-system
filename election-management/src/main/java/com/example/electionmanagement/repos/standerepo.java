package com.example.electionmanagement.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.electionmanagement.models.Stander;

@Repository
public interface standerepo extends JpaRepository<Stander,Integer>{
    List<Stander> findByEid(int eid);
    List<Stander> findByCidAndEid(String cid , int eid);
}

