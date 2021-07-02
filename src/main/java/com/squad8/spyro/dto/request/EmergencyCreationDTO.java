package com.squad8.spyro.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmergencyCreationDTO implements Serializable {

    private static final long serialVersionUID=1L;

    private String partNumber;
    private String state;
    private String address;
    private Date date;
    private Date reportedTime;
}
