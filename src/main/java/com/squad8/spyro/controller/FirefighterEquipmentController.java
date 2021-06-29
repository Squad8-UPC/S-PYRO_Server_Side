package com.squad8.spyro.controller;


import com.squad8.spyro.entity.Firefighter;
import com.squad8.spyro.entity.FirefighterEquipment;
import com.squad8.spyro.service.FirefighterEquipmentService;
import com.squad8.spyro.service.FirefighterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/firefighterequipment/")
public class FirefighterEquipmentController {

    @Autowired
    FirefighterEquipmentService firefighterEquipmentService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("")
    public List<FirefighterEquipment> getFirefighterEquipments(){
        return firefighterEquipmentService.getAllFireFighterEquiments();
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("")
    public FirefighterEquipment addFirefighter(@RequestBody FirefighterEquipment firefighterEquipment){

        return firefighterEquipmentService.addFireFighterEquiment(firefighterEquipment);
    }


}
