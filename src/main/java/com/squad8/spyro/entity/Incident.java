package com.squad8.spyro.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "incident")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Incident {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "incident_id", unique = true, nullable = false)
    private String id;

    @Column(name = "hours")
    private Date hours;

    @Column(name = "stressLevel")
    private Integer stressLevel;

    @Column(name = "psi")
    private Integer psi;

    @Column(name = "heart_rate")
    private Integer heart_rate;

    @Column(name = "gsr")
    private Float gsr;

    @OneToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "firefighter_equipment_id",nullable = true)
    private FirefighterEquipment firefighterEquipment;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "fire_extinction_operation_id",nullable = true)
    private FireExtinctionOperation fireExtinctionOperation;

    @Column(name = "type",length = 20)
    private String type;

}
