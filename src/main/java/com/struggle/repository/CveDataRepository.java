package com.struggle.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.struggle.model.CveData;
@Repository
public interface CveDataRepository extends JpaRepository<CveData, String> {

	CveData save(List<CveData> cveData);

	
		
	
}
