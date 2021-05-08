package com.squad8.spyro.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "supervisor")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Supervisor {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "supervisor_id", unique = true, nullable = false)
    private String id;

    @Column(name = "location_latitude")
    private String email;

    @Column(name = "location_longitude")
    private String password;

    @OneToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "firefighter_id",nullable = true)
    private Firefighter firefighter;
}
