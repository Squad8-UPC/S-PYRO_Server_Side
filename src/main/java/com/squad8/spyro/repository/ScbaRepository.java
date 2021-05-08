package com.squad8.spyro.repository;

import com.squad8.spyro.entity.Scba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScbaRepository extends JpaRepository<Scba, String> {
}
