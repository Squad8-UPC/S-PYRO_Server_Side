package com.squad8.spyro.service;

import com.squad8.spyro.entity.Supervisor;
import net.bytebuddy.implementation.bind.annotation.Super;

import java.util.List;

public interface SupervisorService {


    public List<Supervisor> getALlSupervisors();

    public Supervisor addSupervisor(Supervisor supervisor);

}
