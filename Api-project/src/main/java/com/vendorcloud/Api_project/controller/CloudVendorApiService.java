package com.vendorcloud.Api_project.controller;

import com.vendorcloud.Api_project.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")

public class CloudVendorApiService {

     CloudVendor cloudVendor;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable String vendorId)
    {
        return new CloudVendor("c1","vendor1",
                "address1","12344322");
    }
    @PostMapping
    public String creatCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor =cloudVendor;
        return "cloudVendor successfully created";
    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor =cloudVendor;
        return "cloudVendor successfully updated";
    }
    @DeleteMapping
    public String deleteCloudVendordeatils(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor =cloudVendor;
        return "cloudVendor successfully deleted";
    }
}
