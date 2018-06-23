package com.anna.repository;

import java.math.BigDecimal;

import org.springframework.data.repository.CrudRepository;

import com.anna.component.Student;

public interface StudentRepository extends CrudRepository<Student , BigDecimal>{

}
