package com.lcl.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.lcl.admin.Admin;

public interface MapperAdmin {
	@Select("select * from admin where adminname = #{adminname} and adminpassword = #{adminpassword}")
	public Admin FindAdmin(@Param("adminname")String adminname,@Param("adminpassword")String adminpassword);
}
