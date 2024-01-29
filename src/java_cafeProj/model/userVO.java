package java_cafeProj.model;

import java.util.Date;

public class userVO {
	private String name;
	private String id;
	private String pw;
	private String phone;
	private Date date;
	public userVO(String name, String id, String pw, String phone, Date date) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.phone = phone;
		this.date = new Date();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
