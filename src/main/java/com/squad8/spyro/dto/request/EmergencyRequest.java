package com.squad8.spyro.dto.request;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class EmergencyRequest implements Serializable {

    private static final long serialVersionUID=1L;

    private Double locationLatitude;
    private Double locationLongitude;
    private String address;
    private Date date;
    private Date reportedTime;
    private Date endTime;

}
