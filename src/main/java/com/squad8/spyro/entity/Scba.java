package com.squad8.spyro.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "scba")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Scba {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "scba_id", unique = true, nullable = false)
    private String id;

    @Column(name = "code")
    private String code;

    @Column(name = "due_date")
    private Date dueDate;

    @Column(name = "last_test_date")
    private Date lastTestDate;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "device_id",nullable = false)
    private Device device;

}
