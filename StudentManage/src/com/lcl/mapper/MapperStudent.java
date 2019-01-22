package com.lcl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.lcl.student.Student;

public interface MapperStudent {
	//增
	@Insert("insert into students(stu_id,stu_name,stu_sex,stu_age)values(id.nextval,#{stu_name},#{stu_sex},#{stu_age})")
	public int AddStudent(Student s);
	//删
	@Delete("delete from students where stu_id = #{id}")
	public int DeleteStudent(int id);
	//改
	@Update("update  students set stu_name = #{stu_name},stu_sex = #{stu_sex},stu_age = #{stu_age} where stu_id = #{stu_id}")
	public int UpdateStudent(Student s);
	//查
	@Select("select * from students where stu_id = #{id}")
	public Student FindStudent(int id);
	//查找全部
	@Select("select * from students")
	public List<Student> GetALL();
}
