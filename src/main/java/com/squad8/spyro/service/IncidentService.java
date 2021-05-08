package com.squad8.spyro.service;

import com.squad8.spyro.entity.Incident;

import java.util.List;

public interface IncidentService {

    public List<Incident> getAllIncidents();

    public Incident addIncident(Incident incident);


}
