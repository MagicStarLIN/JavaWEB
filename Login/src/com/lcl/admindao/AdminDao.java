package com.lcl.admindao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.lcl.MyUtil.DBUtil;
import com.lcl.admin.Admin;
import com.lcl.mapper.MapperAdmin;

public class AdminDao {
	public Admin isAdmin(String adminname,String adminpassword){
		SqlSession sqlSession = DBUtil.getSqlSession(true);
		MapperAdmin ma = sqlSession.getMapper(MapperAdmin.class);
		Admin a = ma.FindAdmin(adminname, adminpassword);
		return a;
	}
}
