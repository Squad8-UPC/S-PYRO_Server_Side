package com.squad8.spyro.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "firefighter")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Firefighter {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "firefighter_id", unique = true, nullable = false)
    private String id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "birthdate")
    private Date birthdate;

    @Column(name = "dni", length = 8)
    private String dni;

    @Column(name = "email")
    private String email;

    @Column(name = "weight")
    private Float weight;

    @Column(name = "height")
    private Integer height;

}
