package com.springjpa.service.impl;
import com.springjpa.entity.Address;
import com.springjpa.entity.Laptop;
import com.springjpa.entity.Student;
import com.springjpa.repo.StudentRepo;
import com.springjpa.service.StudentService;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepo studentRepo;

    @Override
    public void saveStudents() {

    	Address address = new Address();
    	address.setStreet("Mohadi Road");
    	address.setCity("Jalgaon");
    	address.setState("Maharashtra");
    	
    	Address address1 = new Address();
    	address1.setStreet("Hinjewadi Rd");
    	address1.setCity("Pune");
    	address1.setState("Maharashtra");
    	
        Student student = new Student();
        student.setName("Sushil");
        
        student.getAddress().add(address);
        student.getAddress().add(address1);
        
        Laptop laptop = new Laptop();
        laptop.setModel("Dell");
        laptop.setSerialNo(453657);
        laptop.setStudent(student);
        student.setLaptop(laptop);
        
        studentRepo.save(student);
        
    }
}
