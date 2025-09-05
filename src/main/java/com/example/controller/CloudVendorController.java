package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.CloudVendor;
import com.example.service.CloudVendorService;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/cloudvendors")
public class CloudVendorController {

    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("/{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        return cloudVendorService.getCloudVendor(vendorId);
    }

    @GetMapping
    public List<CloudVendor> getAllCloudVendorDetails() {
        return cloudVendorService.getAllCloudVendors();
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudvendor) {
        System.out.println("Received Vendor: " + cloudvendor.getVendorId() + cloudvendor.getVendorName());
        cloudVendorService.createCloudVendor(cloudvendor);
        return "Cloud Vendor successfully created!";
    }

    @PutMapping("/{vendorId}")
    public String updateCloudVendorDetails(@PathVariable("vendorId") String vendorId,
            @RequestBody CloudVendor cloudvendor) {
        System.out.println("Vendor details received for updating: " + vendorId);
        cloudvendor.setVendorId(vendorId);
        cloudVendorService.updateCloudVendor(cloudvendor);
        return "Cloud Vendor with ID " + vendorId + " updated successfully!";
    }

    @DeleteMapping("/{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        System.out.println("Vendor details received for deletion: " + vendorId);
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor Details with ID " + vendorId + " deleted successfully";
    }

}