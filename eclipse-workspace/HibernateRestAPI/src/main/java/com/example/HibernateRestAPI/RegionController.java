package com.example.HibernateRestAPI;

import com.example.hibernaterestapi.model.Region;
import com.example.hibernaterestapi.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/regions")
public class RegionController {

    @Autowired
    private RegionService regionService;

    @GetMapping
    public List<Region> getAllRegions() {
        return regionService.getAllRegions();
    }

    @GetMapping("/{id}")
    public Optional<Region> getRegionById(@PathVariable String id) {
        return regionService.getRegionById(id);
    }

    @PostMapping
    public Region addRegion(@RequestBody Region region) {
        return regionService.addRegion(region);
    }

    @PutMapping("/{id}")
    public Region updateRegion(@PathVariable String id, @RequestBody Region region) {
        return regionService.updateRegion(id, region);
    }

    @DeleteMapping("/{id}")
    public void deleteRegion(@PathVariable String id) {
        regionService.deleteRegion(id);
    }
}
