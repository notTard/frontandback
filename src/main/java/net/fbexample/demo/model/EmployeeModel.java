package net.fbexample.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")//таблица "employee"
public class EmployeeModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name ="first_name")
	private String firstname;
	
	@Column(name ="last_name")//переменные(поля) для    
	private String lastname;  //id,имени,фамилии,почты работника
	
	@Column(name ="email")
	private String email;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirst_name() {
		return firstname;
	}
	public void setFirst_name(String first_name) {//геттеры и сеттеры
		this.firstname = first_name;              //для каждого поля
	}
	public String getLast_name() {
		return lastname;
	}
	public void setLast_name(String last_name) {
		this.lastname = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
