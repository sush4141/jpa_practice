package com.springjpa.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.Cascade;

@Entity
@Data
@ToString
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "student_name")
    private String name;

    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private Laptop laptop;
    
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Address> address = new ArrayList<>();
}