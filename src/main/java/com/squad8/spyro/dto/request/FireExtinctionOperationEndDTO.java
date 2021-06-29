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
public class FireExtinctionOperationEndDTO implements Serializable {
    private String fireExtinctionOperationId;
    private String endTime;
}

