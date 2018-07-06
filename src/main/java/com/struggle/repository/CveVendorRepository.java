package com.struggle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.struggle.model.CveVendor;
@Repository
public interface CveVendorRepository extends JpaRepository<CveVendor, Integer> {

}
