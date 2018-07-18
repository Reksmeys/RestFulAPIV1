package com.reksmey.demo.repositories.student;

import com.reksmey.demo.Model.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository {

    @Select("SELECT * FROM student")
    public List<Student> findAllStudent();

    @Insert("INSERT INTO student(name,sex,dob,profile)" +
            " VALUES(#{name},#{sex},#{dob},#{profile})")
    public boolean insertToStudent(Student stu);

    @Select("SELECT * FROM student WHERE id = #{id}")
    public Student findOneStudent(int id);

    @Update("UPDATE student SET name = #{name}, sex = #{sex}, " +
            "dob = #{dob}, profile = #{profile} WHERE id = #{id}")
    public boolean updateStudent(Student student);

}
