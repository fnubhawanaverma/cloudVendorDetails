package com.vendorcloud.Api_project.service.impl;

import com.vendorcloud.Api_project.model.CloudVendor;
import com.vendorcloud.Api_project.repository.CloudVendorRepository;
import com.vendorcloud.Api_project.service.CloudVendorService;

import java.util.List;

public class CloudVendorServiceImpl implements CloudVendorService {
    CloudVendorRepository cloudVendorRepository;

    public String createCloudVendor(CloudVendor cloudVendor) {
        this.cloudVendorRepository= cloudVendorRepository;
        return null;
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendor.setVendorId(String ven);
        return "";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        return "";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        return null;
    }

    @Override
    public List<CloudVendor> getAllCloudVendor() {
        return List.of();
    }
}
