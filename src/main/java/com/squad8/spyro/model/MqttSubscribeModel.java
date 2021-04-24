package com.squad8.spyro.model;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class MqttSubscribeModel {

    private String message;
    private Integer qos;
    private Integer id;


}