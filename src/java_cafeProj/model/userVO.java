package java_cafeProj.model;

import java.util.Date;

public class userVO {
	
	String name;
	String pw;
	Date date;
	
	public userVO(String name, String pw) {
		this.name = name;
		this.pw = pw;
		this.date = new Date();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
