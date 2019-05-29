package com.pojo.victor;

public class SchoolNew {

	private int schoolnid;
	private String schoolnewtitle;
	private String schoolnewcontent;
	public int getSchoolnid() {
		return schoolnid;
	}
	public void setSchoolnid(int schoolnid) {
		this.schoolnid = schoolnid;
	}
	public String getSchoolnewtitle() {
		return schoolnewtitle;
	}
	public void setSchoolnewtitle(String schoolnewtitle) {
		this.schoolnewtitle = schoolnewtitle;
	}
	public String getSchoolnewcontent() {
		return schoolnewcontent;
	}
	public void setSchoolnewcontent(String schoolnewcontent) {
		this.schoolnewcontent = schoolnewcontent;
	}
	@Override
	public String toString() {
		return "SchoolNew [schoolnid=" + schoolnid + ", schoolnewtitle=" + schoolnewtitle + ", schoolnewcontent="
				+ schoolnewcontent + "]";
	}
	public SchoolNew(int schoolnid, String schoolnewtitle, String schoolnewcontent) {
		super();
		this.schoolnid = schoolnid;
		this.schoolnewtitle = schoolnewtitle;
		this.schoolnewcontent = schoolnewcontent;
	}
	public SchoolNew() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
