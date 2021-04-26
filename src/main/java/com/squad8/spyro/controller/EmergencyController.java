package com.squad8.spyro.controller;


import com.squad8.spyro.service.EmergencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/emergency")
public class EmergencyController {

    @Autowired
    EmergencyService emergencyService;

}
