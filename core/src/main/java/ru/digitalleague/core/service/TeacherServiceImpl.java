package ru.digitalleague.core.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import ru.digitalleague.core.api.TeacherService;
import ru.digitalleague.core.mapper.TeacherMapper;
import ru.digitalleague.core.model.Teacher;

@Slf4j
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {
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
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public int updateByPrimaryKey(Teacher record) {
        return teacherMapper.updateByPrimaryKey(record);
    }
}
