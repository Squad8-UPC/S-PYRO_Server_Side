package com.squad8.spyro.service;

import com.squad8.spyro.entity.FirefighterEquipment;

import java.util.List;

public interface FirefighterEquipmentService {

    public List<FirefighterEquipment> getAllFireFighterEquiments();

    public FirefighterEquipment addFireFighterEquiment( FirefighterEquipment firefighterEquipment);

}
