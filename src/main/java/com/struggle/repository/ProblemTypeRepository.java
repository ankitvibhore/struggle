package com.struggle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.struggle.model.ProblemType;

public interface ProblemTypeRepository extends JpaRepository<ProblemType, Integer> {

}
