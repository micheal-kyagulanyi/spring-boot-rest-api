package net.eziedev.springbootrestapi.controller;

import net.eziedev.springbootrestapi.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent() {
        return new Student(
                1,
                "Michael",
                "Kyagulanyi"
        );
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Michael", "Kyagulanyi"));
        students.add(new Student(1, "Bennet", "Muwanguzi"));
        students.add(new Student(1, "Pamela", "Kulabako"));
        return students;
    }

    @GetMapping("/student/{id}/{first-name}/{last-name}")
    public Student getStudentById(
            @PathVariable int id,
            @PathVariable("first-name") String firstName,
            @PathVariable("last-name") String lastName) {
        return new Student(
                id,
                firstName,
                lastName
        );
    }
}
