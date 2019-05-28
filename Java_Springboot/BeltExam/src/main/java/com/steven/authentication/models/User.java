package com.steven.authentication.models;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {
	
	//Attributes
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Size(min=1, message="First Name must be greater than 1 characters!")
    private String firstName;
    
    @Size(min=1, message="Last Name must be greater than 1 characters!")
    private String lastName;
    
    @Size(min=1, message="City must be greater than 3 characters!")
    private String city;
    
    @Size(min=1, message="State Name must be greater than 2 characters!")
    private String state;
    
    @Email(message="Email must be valid!")
    private String email;
    
	@NotBlank(message="Password must not be blank!")
    @Size(min=4, message="Password must be greater than 8 characters!")
    private String password;
    
    @Transient
    private String passwordConfirmation;
    
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    
    //Constructors
    public User() {
    }
    
  
    
  
	

	
	//Getters
  public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}

	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public Long getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	//Setters
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}   
}