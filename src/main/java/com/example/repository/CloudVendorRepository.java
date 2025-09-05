package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

}
