package com.itbank.vo;

import java.sql.Date;

/*
IDX         NUMBER       
TITLE       VARCHAR2(60) 
CONTENTS    CLOB         
W_DATE      DATE         
NICK        VARCHAR2(60) 
USERID      VARCHAR2(60) 
 * 
 * 
 * */
public class BoardVO {
	private int idx;
	private String title, nick, userid, contents;
	private Date w_date;
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getW_date() {
		return w_date;
	}
	public void setW_date(Date w_date) {
		this.w_date = w_date;
	}
	
	
	

}
