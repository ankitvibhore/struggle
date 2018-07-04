package com.struggle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.struggle.model.VendorProduct;

public interface VendorProductRepository extends JpaRepository<VendorProduct, Integer> {

}
