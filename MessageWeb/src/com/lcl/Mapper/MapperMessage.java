package com.lcl.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.lcl.message.Message;

public interface MapperMessage {

//1 查询全部留言信息
	@Select("select * from message")
	public List<Message> findAll();
//2 根据mid查询一条留言信息
	@Select("select * from message where mid = #{mid}")
	public Message findMessagewithMid(int mid);
//3 根据mid修改指定留言各列的值(以修改title为例)
	@Update("update message set content = #{content} where mid = #{mid}")
	public int UpdatewithMid(Message m);
//4 根据mid删除留言
	@Delete("delete message where mid = #{mid}")
	public int DeletewitMid(int mid);
	@Insert("insert into message(mid,author,title,content,email,add_date) values(#{mid},#{author},#{title},#{content},#{email},#{add_date})")
	public int InsertMessage(Message msg);
}
