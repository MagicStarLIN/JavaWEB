package com.lcl.student;

public class Student {
	   private int stu_id;
       private String stu_name;
       private String stu_sex;
       private String stu_age;
	
       
    public Student() {
		super();
	}
	public Student(String stu_name, String stu_sex, String stu_age) {
		super();
		this.stu_name = stu_name;
		this.stu_sex = stu_sex;
		this.stu_age = stu_age;
	}
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getStu_sex() {
		return stu_sex;
	}
	public void setStu_sex(String stu_sex) {
		this.stu_sex = stu_sex;
	}
	public String getStu_age() {
		return stu_age;
	}
	public void setStu_age(String stu_age) {
		this.stu_age = stu_age;
	}
	@Override
	public String toString() {
		return "Student [stu_id=" + stu_id + ", stu_name=" + stu_name + ", stu_sex=" + stu_sex + ", stu_age=" + stu_age
				+ "]";
	}
       
}
