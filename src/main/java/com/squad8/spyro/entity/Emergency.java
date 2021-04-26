package com.squad8.spyro.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;



@Entity
@Table(name = "emergency")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emergency {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emergency_id", unique = true, nullable = false)
    private UUID id;


    @Column(name = "location_latitude")
    private Double location_latitude;

    @Column(name = "location_longitude")
    private Double location_longitude;

    @Column(name = "address")
    private String address;

    @Column(name = "date")
    private Date date;

    @Column(name = "reported_time")
    private Date reported_time;

    @Column(name = "birthdate")
    private Date end_time;
}