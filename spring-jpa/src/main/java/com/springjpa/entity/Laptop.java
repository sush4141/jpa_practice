package com.springjpa.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@Table(name = "laptop")
@ToString
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "model")
    private String model;

    @Column(name = "serialNo")
    private int serialNo;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
