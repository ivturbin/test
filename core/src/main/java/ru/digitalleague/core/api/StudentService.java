package ru.digitalleague.core.api;

import org.springframework.stereotype.Service;
import ru.digitalleague.core.model.Student;

import java.util.List;

@Service
public interface StudentService {
    int insert(Student record);

    Student selectByPrimaryKey(Long studentId);

    List<Student> getAllStudents();

    int updateByPrimaryKey(Student record);

    Student getStudentById(long id);
}
