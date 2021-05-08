package com.squad8.spyro.service.impl;

import com.squad8.spyro.entity.Supervisor;
import com.squad8.spyro.repository.SupervisorRepository;
import com.squad8.spyro.service.SupervisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupervisorServiceImpl implements SupervisorService {

    @Autowired
    SupervisorRepository supervisorRepository;


    @Override
    public List<Supervisor> getALlSupervisors() {
        return supervisorRepository.findAll();
    }

    @Override
    public Supervisor addSupervisor(Supervisor supervisor) {
        return supervisorRepository.save(supervisor);
    }
}
