package com.squad8.spyro.dto.request;

import io.swagger.models.Operation;
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
public class FireExtinctionOperationGetGroupsDTO implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;
    List<OperationDTO> groups;

}
