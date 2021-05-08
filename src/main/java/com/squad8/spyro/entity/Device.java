package com.squad8.spyro.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "device")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Device {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "device_id", unique = true, nullable = false)
    private String id;

    @Column(name = "type")
    private String type;

    @Column(name = "serial_number")
    private String serialNumber;

}
