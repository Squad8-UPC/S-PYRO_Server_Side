package com.squad8.spyro.service;

import com.squad8.spyro.dto.request.FireExtinctionOperationCreationDTO;
import com.squad8.spyro.dto.request.FireExtinctionOperationEndDTO;
import com.squad8.spyro.entity.FireExtinctionOperation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface FireExtinctionOperationService {


    List<FireExtinctionOperation> getAllFireExtinctionOperations();

    public FireExtinctionOperation addFireExtinctionOperation(FireExtinctionOperationCreationDTO fireExtinctionOperation);

    @Transactional
    public int endFireExtinctionOperation(FireExtinctionOperationEndDTO request);


    public List<FireExtinctionOperation> findByEmergencyId(String emergencyId);
}
