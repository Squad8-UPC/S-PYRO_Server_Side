package com.squad8.spyro.controller;

import com.squad8.spyro.dto.request.FireExtinctionOperationsEndDTO;
import com.squad8.spyro.service.FireExtinctionOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FireExtinctionOperationController {

    @Autowired
    private FireExtinctionOperationService fireExtinctionOperationService;

    @PutMapping
    public String endAllFireExtinctionOperations(FireExtinctionOperationsEndDTO request) throws Exception{
        return fireExtinctionOperationService.endAllFireExtinctionOperations(request);
    }



}
