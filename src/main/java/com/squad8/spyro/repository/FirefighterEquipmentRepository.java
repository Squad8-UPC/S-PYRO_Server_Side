package com.squad8.spyro.repository;

import com.squad8.spyro.entity.FirefighterEquipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirefighterEquipmentRepository extends JpaRepository<FirefighterEquipment, String> {
}
