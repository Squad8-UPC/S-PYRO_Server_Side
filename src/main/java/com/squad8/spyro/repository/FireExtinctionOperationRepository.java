package com.squad8.spyro.repository;

import com.squad8.spyro.entity.FireExtinctionOperation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface FireExtinctionOperationRepository extends JpaRepository<FireExtinctionOperation, String> {


    List<FireExtinctionOperation> findByEmergencyId(String emergencyId);

    @Modifying
    @Query("UPDATE FireExtinctionOperation f SET f.endTime = ?1 WHERE f.id = ?2")
    int updateFireExtinctionOperationEndTimeByEmergencyId(Date endTime, String fireExtinctionOperationId);

}
