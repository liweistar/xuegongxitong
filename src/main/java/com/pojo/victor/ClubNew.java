package com.pojo.victor;

public class ClubNew {

	private int clubnid;
	private String clubnewtitle;
	private String clubnewcontent;
	public int getClubnid() {
		return clubnid;
	}
	public void setClubnid(int clubnid) {
		this.clubnid = clubnid;
	}
	public String getClubnewtitle() {
		return clubnewtitle;
	}
	public void setClubnewtitle(String clubnewtitle) {
		this.clubnewtitle = clubnewtitle;
	}
	public String getClubnewcontent() {
		return clubnewcontent;
	}
	public void setClubnewcontent(String clubnewcontent) {
		this.clubnewcontent = clubnewcontent;
	}
	public ClubNew() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClubNew(int clubnid, String clubnewtitle, String clubnewcontent) {
		super();
		this.clubnid = clubnid;
		this.clubnewtitle = clubnewtitle;
		this.clubnewcontent = clubnewcontent;
	}
	
}
