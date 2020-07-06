package com.projct.car.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
@Entity
@Table(name = "admin")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "admin_id", nullable = false)
	@NotNull(message = "Id can not be null")
	private int id;

	@Column(name = "admin_name")
	@NotNull(message = "Name can not be null")
	@NotEmpty(message = "Name may not be empty")
	@Size(min = 2, max = 32, message = "Name must be between 2 and 32 characters long")
	private String adminName;

	@Column(name = "admin_password")
	@NotNull(message = "Password can not be null")
	@Length(min = 8, max = 12)
	private String password;

	@Email
	@Column(name = "admin_email")
	@NotNull(message = "Email can not be null")
	@NotEmpty(message = "Email may not be empty")
	private String email;

}
