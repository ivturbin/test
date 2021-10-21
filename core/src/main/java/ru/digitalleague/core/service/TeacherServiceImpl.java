package ru.digitalleague.core.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import ru.digitalleague.core.api.TeacherService;
import ru.digitalleague.core.mapper.TeacherMapper;
import ru.digitalleague.core.model.Teacher;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private final TeacherMapper teacherMapper;

    @Override
    public int insert(Teacher record) {
        return teacherMapper.insert(record);
    }

    @Override
    public Teacher selectByPrimaryKey(Long teacherId) {
        return teacherMapper.selectByPrimaryKey(teacherId);
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherMapper.getAllTeachers();
    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public int updateByPrimaryKey(Teacher record) {
        return teacherMapper.updateByPrimaryKey(record);
    }

    @Override
    public Teacher getTeacherById(long id) {
        return teacherMapper.getTeacherById(id);
    }
}
