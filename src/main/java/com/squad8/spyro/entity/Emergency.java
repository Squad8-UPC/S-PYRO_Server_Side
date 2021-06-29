package com.squad8.spyro.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

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
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "emergency_id", unique = true, nullable = false)
    private String id;

    @Column(name = "location_latitude")
    private Double locationLatitude;

    @Column(name = "location_longitude")
    private Double locationLongitude;

    @Column(name = "address")
    private String address;

    @Column(name = "date")
    private Date date;

    @Column(name = "reported_time")
    private Date reportedTime;


    @Column(name = "end_time")
    private Date endTime;
}