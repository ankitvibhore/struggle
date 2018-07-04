package com.struggle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.struggle.model.Description;

public interface DescriptionRepository extends JpaRepository<Description, Integer> {

}
