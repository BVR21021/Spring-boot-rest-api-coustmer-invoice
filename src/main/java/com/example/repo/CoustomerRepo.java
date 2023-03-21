package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Coustmer;

public interface CoustomerRepo extends JpaRepository<Coustmer, Integer> {

}
