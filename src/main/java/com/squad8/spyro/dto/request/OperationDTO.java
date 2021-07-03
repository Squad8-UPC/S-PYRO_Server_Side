package com.squad8.spyro.dto.request;

import com.squad8.spyro.entity.Firefighter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OperationDTO implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;
    private Firefighter firefighter1;
    private Firefighter firefighter2;

    @Override
    public String toString() {
        return "OperationDTO{" +
                "firefighter1=" + firefighter1 +
                ", firefighter2=" + firefighter2 +
                '}';
    }
}
