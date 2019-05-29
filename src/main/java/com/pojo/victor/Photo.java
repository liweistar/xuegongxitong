package com.pojo.victor;

public class Photo {

	private int photoid;
	private String photo;
	public int getPhotoid() {
		return photoid;
	}
	public void setPhotoid(int photoid) {
		this.photoid = photoid;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Photo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Photo(int photoid, String photo) {
		super();
		this.photoid = photoid;
		this.photo = photo;
	}
	
}
