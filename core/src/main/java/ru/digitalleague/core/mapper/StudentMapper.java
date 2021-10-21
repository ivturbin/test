package ru.digitalleague.core.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import ru.digitalleague.core.model.Student;

import java.util.List;

@Mapper
@Repository
public interface StudentMapper {
    void insertAll(List<Student> students);

    @Results(id = "students", value = {
            @Result(property = "studentId", column = "student_id"),
            @Result(property = "fio", column = "fio"),
            @Result(property = "spec", column = "spec"),
            @Result(property = "course", column = "course"),
    })
    @Select("SELECT student_id, fio, spec, course FROM students")
    List<Student> getAllStudents();

    int insert(Student record);

    Student selectByPrimaryKey(Long studentId);

    int updateByPrimaryKey(Student record);

    @Select("SELECT * FROM students WHERE students.id = #{studentId}")
    Student getStudentById(Long studentId);
}
