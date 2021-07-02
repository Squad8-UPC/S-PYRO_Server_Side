package com.squad8.spyro.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "fire_extinction_operation")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FireExtinctionOperation {

    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "fire_extinction_operation_id", unique = true, nullable = false)
    private String id;


    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "emergency_id",nullable = false)
    private Emergency emergency;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "firefighter_equipment_1_id",nullable = true)
    private FirefighterEquipment firefighterEquipment1;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "firefighter_equipment_2_id",nullable = true)
    private FirefighterEquipment firefighterEquipment2;

    @Column(name = "entry_time")
    private Date entryTime;

    @Column(name = "end_time")
    private Date endTime;


}
