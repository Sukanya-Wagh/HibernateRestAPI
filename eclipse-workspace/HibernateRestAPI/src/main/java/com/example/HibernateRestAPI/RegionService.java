package com.example.HibernateRestAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegionService {

    @Autowired
    private RegionRepository regionRepository;

    public List<Region> getAllRegions() {
        return regionRepository.findAll();
    }

    public Optional<Region> getRegionById(String id) {
        return regionRepository.findById(id);
    }

    public Region addRegion(Region region) {
        return regionRepository.save(region);
    }

    public Region updateRegion(String id, Region updatedRegion) {
        updatedRegion.setRegionId(id);
        return regionRepository.save(updatedRegion);
    }

    public void deleteRegion(String id) {
        regionRepository.deleteById(id);
    }
}
