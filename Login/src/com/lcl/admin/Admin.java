package com.lcl.admin;

public class Admin {
	private Integer adminid;
	private String adminname;
	private String adminpassword;
	private Integer flag;
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	public Integer getAdminid() {
		return adminid;
	}
	public void setAdminid(Integer adminid) {
		this.adminid = adminid;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getAdminpassword() {
		return adminpassword;
	}
	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}
	@Override
	public String toString() {
		return "Admin [adminid=" + adminid + ", adminname=" + adminname + ", adminpassword=" + adminpassword + "]";
	}
	
}
