package com.example.userservice.service;

import com.example.userservice.entity.Dashboard;
import com.example.userservice.repository.DashboardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService {

    private final DashboardRepository dashboardRepository;

    public DashboardService(DashboardRepository dashboardRepository){
        this.dashboardRepository = dashboardRepository;
    }

    public List<Dashboard> getAllDashboardData(){
        return dashboardRepository.findAll();
    }

    public Dashboard save(Dashboard dashboard){
        return dashboardRepository.save(dashboard);
    }

    public void delete(Long id){
        dashboardRepository.deleteById(id);
    }

}
