package com.gasigwatin.REST_4_Springboot_project_withDatabases;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FirstController {

    private final StudentRepository repository;

    public FirstController(StudentRepository repository) {
        this.repository = repository;
    }

//    LET'S NOW PERFORM CRUD

    //1. CREATE
    @PostMapping("/students")
    public Student postTable(
            @RequestBody Student student) {
        return repository.save(student);
    }

    //2. READ (FIND STUDENT BY ID)
    @GetMapping("/students/{student-id}")
    public Student findStudentById(
            @PathVariable("student-id") Integer id){

        return repository.findById(id).orElse(new Student());

    }

    //3. READ (FIND ALL STUDENTS)

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    //4. READ (FIND STUDENT BY NAME)(THIS IS ALSO UPDATE)

    @GetMapping("/students/search/{student-name}")
    public List<Student> findStudentByName(
            @PathVariable("student-name") String name){

        //We can't find the student using the name, because we don't have that method: return repository.findByName(); would not work
        //So in order to retrieve the student by name, we need to go to the Student Repository and create a List of Student, that will find the student by using the first name
        // remember to use the capital in creating the list e.g findByFirstName

        return repository.findByFirstname(name);
    }

    @DeleteMapping("students/{student-id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteStudentById(
            @PathVariable("student-id") Integer id){

        repository.deleteById(id);

    }
}
