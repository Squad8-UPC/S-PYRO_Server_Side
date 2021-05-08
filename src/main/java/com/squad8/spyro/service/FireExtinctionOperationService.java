package com.squad8.spyro.service;

import com.squad8.spyro.entity.FireExtinctionOperation;

import java.util.List;

public interface FireExtinctionOperationService {

    public List<FireExtinctionOperation> getAllFireExtinctionOperations();

    public FireExtinctionOperation addFireExtinctionOperation(FireExtinctionOperation fireExtinctionOperation);



}
