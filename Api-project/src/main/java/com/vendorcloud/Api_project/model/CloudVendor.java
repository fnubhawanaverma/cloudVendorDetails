package com.vendorcloud.Api_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name="cloud_vendor_info")
public class CloudVendor {
    private String vendorName;
    @Id
    private String vendorId;
    private String vendorType;
    private String vendorPhone;

    public CloudVendor(String vendorName, String vendorId, String vendorType, String vendorPhone) {
        this.vendorName = vendorName;
        this.vendorId = vendorId;
        this.vendorType = vendorType;
        this.vendorPhone = vendorPhone;
    }

    public CloudVendor() {

    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public void setVendorType(String vendorType) {
        this.vendorType = vendorType;
    }

    public void setVendorPhone(String vendorPhone) {
        this.vendorPhone = vendorPhone;
    }
}
