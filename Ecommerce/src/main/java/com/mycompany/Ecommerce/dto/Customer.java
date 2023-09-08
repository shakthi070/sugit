package com.mycompany.Ecommerce.dto;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class Customer
{
	@Id
	@GeneratedValue(generator = "customer_id")
	@SequenceGenerator(name="customer_id",initialValue = 111001, allocationSize = 1, sequenceName ="customer_id" )
	private int id;
	@Size(min=5,message = "Atleast enter 5 character")
	private String name;
	@Email(message = "Email formate is not valid")
	private String email;
	@Size(max=10, message="number should be 10 digits")
	private long mobile;
	private String password;
	private String gender;
	private LocalDate dob;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", password="
				+ password + ", gender=" + gender + ", dob=" + dob + "]";
	}
	
	
	
}
