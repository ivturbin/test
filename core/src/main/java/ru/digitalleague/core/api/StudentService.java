package ru.digitalleague.core.api;

import org.springframework.stereotype.Service;
import ru.digitalleague.core.model.Student;

@Service
public interface StudentService {
    int insert(Student record);

    Student selectByPrimaryKey(Long studentId);

    int updateByPrimaryKey(Student record);

}
