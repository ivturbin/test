package ru.digitalleague.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import ru.digitalleague.core.model.Student;
import ru.digitalleague.core.model.Teacher;

import java.util.List;

@Mapper
@Repository
public interface TeacherMapper {
    void insertAll(List<Teacher> teachers);

    @Results(id = "teachers", value = {
            @Result(property = "teacherId", column = "teacher_id"),
            @Result(property = "fio", column = "fio"),
            @Result(property = "cafId", column = "caf_id"),
    })
    @Select("SELECT teacher_id, fio, caf_id FROM teachers")
    List<Teacher> getAllTeachers();

    int insert(Teacher record);

    Teacher selectByPrimaryKey(Long teacherId);

    int updateByPrimaryKey(Teacher record);
    @Select("SELECT * FROM teachers WHERE teachers.id = #{teacherId}")
    Teacher getTeacherById(Long teacherId);
}
