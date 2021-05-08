package com.squad8.spyro.controller;

import com.squad8.spyro.entity.Device;
import com.squad8.spyro.entity.Supervisor;
import com.squad8.spyro.service.DeviceService;
import com.squad8.spyro.service.SupervisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/supervisor/")
public class SupervisorController {

    @Autowired
    SupervisorService supervisorService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("")
    public List<Supervisor> getSupervisors(){
        return supervisorService.getALlSupervisors();
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("")
    public Supervisor addSupervisor(@RequestBody Supervisor supervisor){
        return supervisorService.addSupervisor(supervisor);
    }


}
