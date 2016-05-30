package com.ravi.masala.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "USER")
public class LoginModel {
	 
	@Id
    @Column(name = "USERID")
    private String userName;
 	
 	@Column(name = "FIRSTNAME")
    private String firstname;

 	@Column(name = "LASTNAME")
    private String lastname;

 	@Column(name = "EMAIL")
    private String email;
    
 	@Column(name = "PASSWORD")
    private String password;

    
    
    
    public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
    @Override
    public String toString() {
        return "LoginModel{" + "userName=" + userName + ", password=" + password + '}';
    }
}