package com.steven.authentication.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="events")
public class Event {
	
	//Attributes
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Size(min=1, message="Name must be greater than 1 characters!")
	private String name;
	
    @DateTimeFormat(pattern="yyyy-mm-dd")
	private Date date;

    @Size(min=1, message="City must be greater than 1 characters!")
	private String city;
	
    @Size(min=1, message="City must be greater than 1 characters!")
	private String state;
	
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="MM:dd:yyy HH:mm:ss")
	private Date createdAt;
	@Column(updatable=false)
	@DateTimeFormat(pattern="MM:dd:yyy HH:mm:ss")
	private Date updatedAt;

	@PrePersist
	protected void onCreate(){
	    this.createdAt = new Date();
	}
	@PreUpdate
	protected void onUpdate(){
	    this.updatedAt = new Date();
	}
	
	
    //RELAATIONSHIPS MANY TO MANY
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
    	name = "users_events",
    	joinColumns = @JoinColumn(name = "event_id"),
    	inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> users;
    
    
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
    //RELAATIONSHIPS ONE TO MANY

   @OneToMany(mappedBy = "event", fetch=FetchType.LAZY)
    private List<Message> messages;

   
   
	public List<Message> getMessages() {
	return messages;
}
	public void setMessages(List<Message> messages) {
	this.messages = messages;
}

    
    
	//GETTERS and SETTERS
	


	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	
	
	
	
}




