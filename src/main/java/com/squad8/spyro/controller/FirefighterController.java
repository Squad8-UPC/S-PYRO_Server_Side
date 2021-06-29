package com.squad8.spyro.controller;


import com.squad8.spyro.entity.Emergency;
import com.squad8.spyro.entity.Firefighter;
import com.squad8.spyro.service.EmergencyService;
import com.squad8.spyro.service.FirefighterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/firefighter/")
public class FirefighterController {

    @Autowired
    FirefighterService firefighterService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("")
    public List<Firefighter> getFirefighters(){
        return firefighterService.getAllFirefighters();
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("")
    public Firefighter addFirefighter(@RequestBody Firefighter firefighter){

        return firefighterService.addFirefighter(firefighter);
    }

}
