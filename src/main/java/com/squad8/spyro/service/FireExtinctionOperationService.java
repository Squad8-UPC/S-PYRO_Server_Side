package com.squad8.spyro.service;

import com.squad8.spyro.dto.request.FireExtinctionOperationsEndDTO;
import com.squad8.spyro.entity.FireExtinctionOperation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

public interface FireExtinctionOperationService {

    public List<FireExtinctionOperation> getAllFireExtinctionOperations();

    public FireExtinctionOperation addFireExtinctionOperation(FireExtinctionOperation fireExtinctionOperation);

    @Transactional
    public int endAllFireExtinctionOperations(FireExtinctionOperationsEndDTO request);

}
