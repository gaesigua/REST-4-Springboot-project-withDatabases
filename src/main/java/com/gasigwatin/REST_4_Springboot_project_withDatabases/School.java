package com.gasigwatin.REST_4_Springboot_project_withDatabases;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class School {

    @Id
    @GeneratedValue
    private Integer id;

    private String schoolName;


    @OneToMany(mappedBy = "school")
    private List<Student> student;

    //A Constructor for the Class

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    //An empty constructor (REQUIRED)

    public School() {

    }

    //The Getter and Setter for the Id

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //The Getter and Setter for the Schoolname

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    //The Getter and Setter for the Student Container(List)
    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }
}
