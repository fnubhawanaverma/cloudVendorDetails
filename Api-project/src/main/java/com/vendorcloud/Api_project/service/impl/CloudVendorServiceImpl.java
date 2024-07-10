package com.vendorcloud.Api_project.service.impl;

import com.vendorcloud.Api_project.model.CloudVendor;
import com.vendorcloud.Api_project.repository.CloudVendorRepository;
import com.vendorcloud.Api_project.service.CloudVendorService;

import java.util.List;

public class CloudVendorServiceImpl implements CloudVendorService {
    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Successfully created Cloud Vendor";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "cloud vendor updated";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        return cloudVendorRepository.findById(cloudVendorId).get();
    }
    @Override
    public List<CloudVendor> getAllCloudVendor() {
        return (List<CloudVendor>) cloudVendorRepository.findAll();
    }
}
