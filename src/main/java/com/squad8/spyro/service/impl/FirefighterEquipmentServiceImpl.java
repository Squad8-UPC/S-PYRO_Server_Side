package com.squad8.spyro.service.impl;

import com.squad8.spyro.entity.FirefighterEquipment;
import com.squad8.spyro.repository.FirefighterEquipmentRepository;
import com.squad8.spyro.service.FirefighterEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirefighterEquipmentServiceImpl implements FirefighterEquipmentService {

    @Autowired
    FirefighterEquipmentRepository firefighterEquipmentRepository;

    @Override
    public List<FirefighterEquipment> getAllFireFighterEquiments() {
        return firefighterEquipmentRepository.findAll();
    }

    @Override
    public FirefighterEquipment addFireFighterEquiment(FirefighterEquipment firefighterEquipment) {
        return firefighterEquipmentRepository.save(firefighterEquipment);
    }
}
