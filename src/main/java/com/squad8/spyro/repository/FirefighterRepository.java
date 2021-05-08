package com.squad8.spyro.repository;

import com.squad8.spyro.entity.Firefighter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirefighterRepository extends JpaRepository<Firefighter, String> {
}
