package com.squad8.spyro.controller;


import com.squad8.spyro.entity.Emergency;
import com.squad8.spyro.service.EmergencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/emergency/")
public class EmergencyController {

    @Autowired
    EmergencyService emergencyService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("")
    public List<Emergency> getEmergencies(){
        return emergencyService.getAllEmergencies();
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("")
    public Emergency addEmergencies(@RequestBody Emergency emergency){
        return emergencyService.addEmergency(emergency);
    }


}
