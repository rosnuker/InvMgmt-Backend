package com.cap1grp16.invmgmt.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cap1grp16.invmgmt.Entity.LocationEntity;
import com.cap1grp16.invmgmt.Service.LocationService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class LocationController {

    @Autowired
    LocationService lserv;

    @GetMapping("/getAllLocations")
    public List<LocationEntity> getAllLocations() {
        return lserv.getAllLocations();
    }

}
