package com.cap1grp16.invmgmt.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap1grp16.invmgmt.Entity.LocationEntity;
import com.cap1grp16.invmgmt.Repository.LocationRepository;

@Service
public class LocationService {

    @Autowired
    LocationRepository lrepo;

    public List<LocationEntity> getAllLocations() {
        return lrepo.findAll();
    }

}
