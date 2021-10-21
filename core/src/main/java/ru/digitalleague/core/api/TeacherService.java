package ru.digitalleague.core.api;

import org.springframework.stereotype.Service;
import ru.digitalleague.core.model.Teacher;

@Service
public interface TeacherService {
    int insert(Teacher record);

    Teacher selectByPrimaryKey(Long teacherId);

    int updateByPrimaryKey(Teacher record);

}
