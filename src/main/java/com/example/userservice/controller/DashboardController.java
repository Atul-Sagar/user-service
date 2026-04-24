package com.example.userservice.controller;

import com.example.userservice.entity.Dashboard;
import com.example.userservice.repository.DashboardRepository;
import com.example.userservice.service.DashboardService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dashboard")
@SecurityRequirement(name="bearerAuth")
public class DashboardController {

    private final DashboardService dashboardService;
    private final DashboardRepository dashboardRepository;

    public DashboardController(DashboardService dashboardService, DashboardRepository dashboardRepository){
        this.dashboardService = dashboardService;
        this.dashboardRepository = dashboardRepository;
    }

    @GetMapping
    public List<Dashboard> getDashboard(){
        return dashboardService.getAllDashboardData();
    }

    @PostMapping
    public Dashboard create(@RequestBody Dashboard dashboard){
        return dashboardService.save(dashboard);
    }

    @PutMapping("/{id}")
    public Dashboard update(@PathVariable Long id, @RequestBody Dashboard dashboard){
        Dashboard existing = dashboardRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not Found"));

        existing.setTitle(dashboard.getTitle());
        existing.setDescription(dashboard.getDescription());

        return dashboardRepository.save(existing);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        dashboardService.delete(id);
    }

}
