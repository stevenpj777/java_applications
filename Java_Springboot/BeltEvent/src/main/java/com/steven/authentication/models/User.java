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
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import com.steven.authentication.models.Message;
import com.steven.authentication.models.Event;


@Entity
@Table(name="users")
public class User {
	
	//Attributes
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Size(min=2, message="First name must be greater than 2 characters!")
    private String firstName;
    
    @Size(min=2, message="Last name must be greater than 2 characters!")
    private String lastName;
    
    @Size(min=2, message="City must be greater than 2 characters!")
    private String city;
    
    @Size(min=2, message="State must be greater than 2 characters!")
    private String state;
    

	@Email(message="Email must be valid!")
    private String email;
    
    @Size(min=2, message="Password must be greater than 8 characters!")
    private String password;
    
    @Transient
    private String passwordConfirmation;
    
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "users_events", 
        joinColumns = @JoinColumn(name = "user_id"), 
        inverseJoinColumns = @JoinColumn(name = "event_id")
    )
    private List<Event> joinedevents;
    
    
    @OneToMany(mappedBy="user", fetch = FetchType.LAZY)
    private List<Event> events;
    
 
    @OneToMany(mappedBy="user", fetch = FetchType.LAZY)
  	private List<Message> messages;
    
    
    
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
    
    
   
	public User(String firstName, String lastName,
			@Size(min = 2, message = "City must be greater than 2 characters!") String city,
			@Size(min = 2, message = "State must be greater than 2 characters!") String state,
			@Email(message = "Email must be valid!") String email,
			@Size(min = 2, message = "Password must be greater than 8 characters!") String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.email = email;
		this.password = password;
	}
	
	
	
	
	public List<Event> getJoinedevents() {
		return joinedevents;
	}
	public void setJoinedevents(List<Event> joinedevents) {
		this.joinedevents = joinedevents;
	}
	public List<Event> getEvents() {
		return events;
	}
	public void setEvents(List<Event> events) {
		this.events = events;
	}
	public List<Message> getMessages() {
		return messages;
	}
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}
	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
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