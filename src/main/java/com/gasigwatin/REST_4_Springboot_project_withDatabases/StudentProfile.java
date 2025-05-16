package com.gasigwatin.REST_4_Springboot_project_withDatabases;

import jakarta.persistence.*;

@Entity
public class StudentProfile {

    @Id
    @GeneratedValue
    private Integer studentId;

    private String bio;

    @OneToOne
    @JoinColumn(name="student-id")
    private Student student;

    public StudentProfile(String bio) {
        this.bio = bio;
    }

    public StudentProfile() { }

    public Integer getStudentId() {
        return studentId;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

}
