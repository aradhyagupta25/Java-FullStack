package com.aradhyagupta25.SpringJDBCEx.service;

import com.aradhyagupta25.SpringJDBCEx.model.Student;
import com.aradhyagupta25.SpringJDBCEx.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service    // Service annot because this is a Service class.
public class StudentService {

    private
    StudentRepo studentRepo;

    public StudentRepo getStudentRepo() {
        return studentRepo;
    }
    @Autowired
    public void setStudentRepo(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public void addStudent(Student s) {
        studentRepo.save(s);
        System.out.println("Added Student");
    }

    public List<Student> getStudents(Student s) {
        return studentRepo.findAll();
    }
}
