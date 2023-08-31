/**
 * User.java
 * This class represents user entity in the application
 * 
 * Author: Surya Prakash
 * Contact: suryamdk5@gmail.com
 * 
 * Created on: 2023-08-29
 */

package com.example.card;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String username;
	private String useraddress;
	private String userphone;
	private String usermail;
	private String userprofileimg;
	private LocalDateTime dateupdated;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	public String getUsermail() {
		return usermail;
	}
	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}
	public String getUserprofileimg() {
		return userprofileimg;
	}
	public void setUserprofileimg(String userprofileimg) {
		this.userprofileimg = userprofileimg;
	}
	public LocalDateTime getDateupdated() {
		return dateupdated;
	}
	public void setDateupdated(LocalDateTime dateupdated) {
		this.dateupdated = dateupdated;
	}
	
}
