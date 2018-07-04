package com.struggle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.struggle.model.CveVendor;

public interface CveVendorRepository extends JpaRepository<CveVendor, Integer> {

}
