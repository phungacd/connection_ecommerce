package com.e_commerce.connection.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="users")
@Getter
@Setter
@EqualsAndHashCode
public class Users implements Serializable{

	private static final long serialVersionUID = 5597545262767229022L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
//	@Column(name="first_name",columnDefinition = "varchar(30)")
//	private String firstName;
//	@Column(name="last_name",columnDefinition = "varchar(30)")
//	private String lastName;
	
	@Column(name="user_name",columnDefinition = "varchar(30)")
	private String userName;
	@Column(name="shop_name",columnDefinition = "varchar(50)")
	private String shopName;
	@Column(name="intro",columnDefinition = "varchar(255)")
	private String intro;
	@Column(name="phone_number",columnDefinition = "varchar(30)")
	private String phoneNumber;
	
	
	@Column(name="birthday")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate birthday;
	@Column(name="registered_at")
	private LocalDateTime registeredAt;
	@Column(name="last_login")
	private LocalDateTime lastLogin;
	
	@OneToOne(mappedBy = "user",fetch = FetchType.LAZY)
	private Accounts account;
}
