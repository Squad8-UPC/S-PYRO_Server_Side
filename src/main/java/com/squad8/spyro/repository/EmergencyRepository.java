package com.squad8.spyro.repository;

import com.squad8.spyro.entity.Emergency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EmergencyRepository extends JpaRepository<Emergency, UUID>  {

}
