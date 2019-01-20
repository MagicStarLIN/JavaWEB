package com.lcl.test;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.lcl.Mapper.MapperMessage;
import com.lcl.MyUtil.DBUtil;
import com.lcl.message.Message;

public class Test01 {
	
	@Test
	public void test1(){
		SqlSession sqlSession = DBUtil.getSqlSession(true);
		MapperMessage mm = sqlSession.getMapper(MapperMessage.class);
		List<Message> list = mm.findAll();
		for(Message l : list){
			System.out.println(l.toString());
		}
		sqlSession.close();
	}
	@Test
	public void test2(){
		SqlSession sqlSession = DBUtil.getSqlSession(true);
		MapperMessage mm = sqlSession.getMapper(MapperMessage.class);
		Message m = mm.findMessagewithMid(10);
		System.out.println(m.toString());
	}
	@Test
	public void test3(){
		SqlSession sqlSession = DBUtil.getSqlSession(true);
		MapperMessage mm = sqlSession.getMapper(MapperMessage.class);
		Message m = new Message();
		m.setMid(10);
		m.setAdd_date("new date");
		m.setAuthor("new author");
		m.setContent("new content");
		m.setTitle("newtitle");
		m.setEmail("new email");
		int reResult = mm.UpdatewithMid(m);
		System.out.println("已更新为"+m.toString());
	}
	@Test
	public void test4(){
		SqlSession sqlSession = DBUtil.getSqlSession(true);
		MapperMessage mm = sqlSession.getMapper(MapperMessage.class);
		int reResult = mm.DeletewitMid(10);

		System.out.println(reResult);
	}
}
