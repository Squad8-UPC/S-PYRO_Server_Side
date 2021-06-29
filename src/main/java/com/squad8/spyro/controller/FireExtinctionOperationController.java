package com.squad8.spyro.controller;

import com.squad8.spyro.dto.request.FireExtinctionOperationsEndDTO;
import com.squad8.spyro.entity.FireExtinctionOperation;
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
    public int endAllFireExtinctionOperations(@RequestBody FireExtinctionOperationsEndDTO request) throws Exception{
        return fireExtinctionOperationService.endAllFireExtinctionOperations(request);
    }

    @GetMapping
    public List<FireExtinctionOperation> getFireExtinctionOperations(@PathVariable("emergencyId") String emergencyId){
        return null;
    }



}
