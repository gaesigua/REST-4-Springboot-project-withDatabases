package com.gasigwatin.REST_4_Springboot_project_withDatabases;

import jakarta.persistence.*;

@Entity
@Table(name = "T_STUDENT")
public class Student {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name="f_name")
    private String firstname;

    @Column(name="l_name", length=100)
    private String lastname;

    @Column(unique=true)
    private String email;

    private int age;

    @Column(updatable=false)
    private String gender;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private StudentProfile studentProfile;


    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;

    //A Constructor for the Class

    public Student(String firstname, String lastname, String email, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
    }

    //An empty Constructor (required)

    public Student() {

    }

    //The Getter and Setter for ID

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //The Getter and Setter for FIRSTNAME

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    //The Getter and Setter for LASTNAME

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    //The Getter and Setter for EMAIL

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //The Getter and Setter for AGE

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //The Getter and Setter for SCHOOL

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    //The Getter and Setter for STUDENTPROFILE

    public StudentProfile getStudentProfile() {
        return studentProfile;
    }

    public void setStudentProfile(StudentProfile studentProfile) {
        this.studentProfile = studentProfile;
    }

    //The Getter and Setter for GENDER

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
