package com.pojo.victor;

public class ForeignNew {

	private int foreignnid;
	private String foreignnewtitle;
	private String foreignnewcontent;
	public int getForeignnid() {
		return foreignnid;
	}
	public void setForeignnid(int foreignnid) {
		this.foreignnid = foreignnid;
	}
	public String getForeignnewtitle() {
		return foreignnewtitle;
	}
	public void setForeignnewtitle(String foreignnewtitle) {
		this.foreignnewtitle = foreignnewtitle;
	}
	public String getForeignnewcontent() {
		return foreignnewcontent;
	}
	public void setForeignnewcontent(String foreignnewcontent) {
		this.foreignnewcontent = foreignnewcontent;
	}
	public ForeignNew(int foreignnid, String foreignnewtitle, String foreignnewcontent) {
		super();
		this.foreignnid = foreignnid;
		this.foreignnewtitle = foreignnewtitle;
		this.foreignnewcontent = foreignnewcontent;
	}
	public ForeignNew() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
