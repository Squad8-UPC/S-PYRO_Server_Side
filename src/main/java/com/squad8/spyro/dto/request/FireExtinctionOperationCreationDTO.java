package com.squad8.spyro.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FireExtinctionOperationCreationDTO {
    private String firstFirefighterId;
    private String secondFirefighterId;
    private String firstScbaId;
    private String secondScbaId;
    private String emergencyId;
    private String firstDeviceId;
    private String secondDeviceId;
    private Date entryTime;
}
