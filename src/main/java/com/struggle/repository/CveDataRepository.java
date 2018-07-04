package com.struggle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.struggle.model.CveData;

public interface CveDataRepository extends JpaRepository<CveData, String> {

}
