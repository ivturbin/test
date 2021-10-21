package ru.digitalleague.core.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.digitalleague.core.model.Student;
import ru.digitalleague.core.model.Teacher;

@RestController
@Slf4j
public class Controller {
    @PostMapping("/student")
    public void newStudent(@RequestBody Student student) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValueAsString(student);
            log.info("New student");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @PostMapping("/teacher")
    public void newTeacher(@RequestBody Teacher teacher) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValueAsString(teacher);
            log.info("New teacher");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
