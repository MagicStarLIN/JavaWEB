package com.lcl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.lcl.student.Student;

public interface MapperStudent {
	//��
	@Insert("insert into students(stu_id,stu_name,stu_sex,stu_age)values(id.nextval,#{stu_name},#{stu_sex},#{stu_age})")
	public int AddStudent(Student s);
	//ɾ
	@Delete("delete from students where stu_id = #{id}")
	public int DeleteStudent(int id);
	//��
	@Update("update  students set stu_name = #{stu_name},stu_sex = #{stu_sex},stu_age = #{stu_age} where stu_id = #{stu_id}")
	public int UpdateStudent(Student s);
	//��
	@Select("select * from students where stu_id = #{id}")
	public Student FindStudent(int id);
	//����ȫ��
	@Select("select * from students")
	public List<Student> GetALL();
}
