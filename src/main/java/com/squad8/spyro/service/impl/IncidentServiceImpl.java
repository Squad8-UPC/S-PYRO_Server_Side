package com.squad8.spyro.service.impl;

import com.squad8.spyro.entity.Incident;
import com.squad8.spyro.repository.IncidentRepository;
import com.squad8.spyro.service.IncidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncidentServiceImpl implements IncidentService {

    @Autowired
    IncidentRepository incidentRepository;

    @Override
    public List<Incident> getAllIncidents() {
        return incidentRepository.findAll();
    }

    @Override
    public Incident addIncident(Incident incident) {
        return incidentRepository.save(incident);
    }
}
