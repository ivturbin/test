package ru.digitalleague.core.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import ru.digitalleague.core.api.StudentService;
import ru.digitalleague.core.mapper.StudentMapper;
import ru.digitalleague.core.model.Student;

@Slf4j
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentMapper studentMapper;

    @Override
    public int insert(Student record) {
        return studentMapper.insert(record);
    }

    @Override
    public Student selectByPrimaryKey(Long studentId) {
        return studentMapper.selectByPrimaryKey(studentId);
    }

    @Override
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public int updateByPrimaryKey(Student record) {
        return studentMapper.updateByPrimaryKey(record);
    }

}
