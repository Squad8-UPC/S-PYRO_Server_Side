package com.squad8.spyro.controller;

import com.squad8.spyro.entity.Incident;
import com.squad8.spyro.entity.Scba;
import com.squad8.spyro.service.IncidentService;
import com.squad8.spyro.service.ScbaService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/incident/")
public class IncidentController {

    @Autowired
    IncidentService incidentService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("")
    public List<Incident> getIncidents(){
        return incidentService.getAllIncidents();
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("")
    public Incident addIncident(@RequestBody Incident incident){
        return incidentService.addIncident(incident);
    }

}
