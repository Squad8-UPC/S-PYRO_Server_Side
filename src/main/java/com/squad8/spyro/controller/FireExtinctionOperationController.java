package com.squad8.spyro.controller;

import com.squad8.spyro.dto.request.FireExtinctionOperationCreationDTO;
import com.squad8.spyro.dto.request.FireExtinctionOperationEndDTO;
import com.squad8.spyro.dto.request.FireExtinctionOperationGetGroupsDTO;
import com.squad8.spyro.entity.FireExtinctionOperation;
import com.squad8.spyro.entity.Firefighter;
import com.squad8.spyro.service.FireExtinctionOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fire-extinction-operations/")
public class FireExtinctionOperationController {

    @Autowired
    private FireExtinctionOperationService fireExtinctionOperationService;

    @ResponseStatus(HttpStatus.OK)
    @PutMapping
    public int endFireExtinctionOperation(@RequestBody FireExtinctionOperationEndDTO request) throws Exception{
        return fireExtinctionOperationService.endFireExtinctionOperation(request);
    }

    @GetMapping("groups/{fireExtinctionOperationId}")
    public List<Firefighter> getFireExtinctionOperations(@PathVariable("fireExtinctionOperationId") String fireExtinctionOperationId){
        return fireExtinctionOperationService.findGroupsById(fireExtinctionOperationId);
    }

    @GetMapping("{emergencyId}")
    public FireExtinctionOperationGetGroupsDTO getFireExtinctionOperationsByEmergency(@PathVariable("emergencyId") String emergencyId){
        return fireExtinctionOperationService.findByEmergencyId(emergencyId);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping
    public FireExtinctionOperation addFireExtictionOperation(FireExtinctionOperationCreationDTO fireExtinctionOperation){
        return fireExtinctionOperationService.addFireExtinctionOperation(fireExtinctionOperation);
    }



}
