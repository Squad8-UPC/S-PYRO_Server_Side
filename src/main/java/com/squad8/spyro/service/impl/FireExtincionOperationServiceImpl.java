package com.squad8.spyro.service.impl;

import com.squad8.spyro.entity.FireExtinctionOperation;
import com.squad8.spyro.repository.FireExtinctionOperationRepository;
import com.squad8.spyro.service.FireExtinctionOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FireExtincionOperationServiceImpl implements FireExtinctionOperationService {

    @Autowired
    FireExtinctionOperationRepository fireExtinctionOperationRepository;

    @Override
    public List<FireExtinctionOperation> getAllFireExtinctionOperations() {
        return fireExtinctionOperationRepository.findAll();
    }

    @Override
    public FireExtinctionOperation addFireExtinctionOperation(FireExtinctionOperation fireExtinctionOperation) {
        return fireExtinctionOperationRepository.save(fireExtinctionOperation);
    }
}
