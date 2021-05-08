package com.squad8.spyro.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "fre_extinction_operation")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FireExtinctionOperation {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "fre_extinction_operation_id", unique = true, nullable = false)
    private String id;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "emergency_id",nullable = false)
    private Emergency emergency;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "firefighter_equipement_1_id",nullable = true)
    private FirefighterEquipement firefighterEquipement1;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "firefighter_equipement_2_id",nullable = true)
    private FirefighterEquipement firefighterEquipement2;

    @Column(name = "entry_time")
    private Date entryTime;

    @Column(name = "end_time")
    private Date endTime;


}
