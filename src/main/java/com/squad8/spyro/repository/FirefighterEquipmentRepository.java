package com.squad8.spyro.repository;

import com.squad8.spyro.entity.FirefighterEquipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FirefighterEquipmentRepository extends JpaRepository<FirefighterEquipment, String> {

    List<FirefighterEquipment> findByScbaIdAndDeviceIdAndFirefighterId(String scbaId, String deviceId, String firefighterId);

}
