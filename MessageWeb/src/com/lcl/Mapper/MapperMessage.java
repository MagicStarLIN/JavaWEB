package com.lcl.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.lcl.message.Message;

public interface MapperMessage {

//1 ��ѯȫ��������Ϣ
	@Select("select * from message")
	public List<Message> findAll();
//2 ����mid��ѯһ��������Ϣ
	@Select("select * from message where mid = #{mid}")
	public Message findMessagewithMid(int mid);
//3 ����mid�޸�ָ�����Ը��е�ֵ(���޸�titleΪ��)
	@Update("update message set content = #{content} where mid = #{mid}")
	public int UpdatewithMid(Message m);
//4 ����midɾ������
	@Delete("delete message where mid = #{mid}")
	public int DeletewitMid(int mid);
	@Insert("insert into message(mid,author,title,content,email,add_date) values(#{mid},#{author},#{title},#{content},#{email},#{add_date})")
	public int InsertMessage(Message msg);
}
