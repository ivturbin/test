package ru.digitalleague.core.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.digitalleague.core.api.StudentService;
import ru.digitalleague.core.api.TeacherService;
import ru.digitalleague.core.model.Student;
import ru.digitalleague.core.model.Teacher;

import java.util.List;

@RestController
@Slf4j
public class Controller {
    @Autowired
    StudentService studentService;

    @Autowired
    TeacherService teacherService;

    @PostMapping("/new_student")
    public void newStudent(@RequestBody Student student) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValueAsString(student);
            log.info("New student");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("get_students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("get_student")
    public Student getStudentById(@RequestParam (value = "id") long id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("/new_teacher")
    public void newTeacher(@RequestBody Teacher teacher) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValueAsString(teacher);
            log.info("New teacher");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("get_teachers")
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    @GetMapping("get_teacher")
    public Teacher getTeacherById(@RequestParam (value = "id") long id) {
        return teacherService.getTeacherById(id);
    }
}
