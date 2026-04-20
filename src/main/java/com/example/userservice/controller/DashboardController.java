package com.example.userservice.controller;

import com.example.userservice.entity.Dashboard;
import com.example.userservice.service.DashboardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

    private final DashboardService dashboardService;

    public DashboardController(DashboardService dashboardService){
        this.dashboardService = dashboardService;
    }

    @GetMapping
    public List<Dashboard> getDashboard(){
        return dashboardService.getAllDashboardData();
    }

}
