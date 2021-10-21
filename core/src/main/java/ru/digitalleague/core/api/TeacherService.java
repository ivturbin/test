package ru.digitalleague.core.api;

import org.springframework.stereotype.Service;
import ru.digitalleague.core.model.Teacher;

import java.util.List;

@Service
public interface TeacherService {
    int insert(Teacher record);

    Teacher selectByPrimaryKey(Long teacherId);

    List<Teacher> getAllTeachers();

    int updateByPrimaryKey(Teacher record);

    Teacher getTeacherById(long id);
}
