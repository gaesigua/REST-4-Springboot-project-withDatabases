package com.gasigwatin.REST_4_Springboot_project_withDatabases;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findByFirstname(String firstname);
}
