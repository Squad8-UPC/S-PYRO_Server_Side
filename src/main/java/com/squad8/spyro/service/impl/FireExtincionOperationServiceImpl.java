package com.squad8.spyro.service.impl;

import com.squad8.spyro.dto.request.FireExtinctionOperationsEndDTO;
import com.squad8.spyro.entity.FireExtinctionOperation;
import com.squad8.spyro.repository.FireExtinctionOperationRepository;
import com.squad8.spyro.service.FireExtinctionOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

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

    @Transactional
    @Override
    public int endAllFireExtinctionOperations(FireExtinctionOperationsEndDTO request) {
        int actualizado = 0;
        try{
            final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            format.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date endTime = format.parse(request.getEndTime());
            actualizado = fireExtinctionOperationRepository.updateFireExtinctionOperationEndTimeByEmergencyId(endTime, request.getEmergencyId());

        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        return actualizado;

    }


}
