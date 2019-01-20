package com.lcl.message;

public class Message {
	private Integer mid;
	private String author;
	private String title;
	private String content;//内容
	private String email;
	private String add_date;
	//TODO  日期类型是否可以转换为String
	public int getMid() {
		return mid;
	}
	public Message(Integer mid, String author, String title, String content, String email, String add_date) {
		super();
		this.mid = mid;
		this.author = author;
		this.title = title;
		this.content = content;
		this.email = email;
		this.add_date = add_date;
	}
	public void setMid(Integer number) {
		this.mid = number;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdd_date() {
		return add_date;
	}
	public void setAdd_date(String add_date) {
		this.add_date = add_date;
	}
	public Message getMessage(Integer id) {
		if(this.mid==id){
			return this;
		}
		else 
			return null;
	}
	@Override
	public String toString() {
		return "Message [number=" + mid + ", author=" + author + ", title=" + title + ", content=" + content
				+ ", email=" + email + ", add_date=" + add_date + "]";
	}
	
}
