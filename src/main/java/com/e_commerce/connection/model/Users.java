package com.e_commerce.connection.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Users implements Serializable{

	private static final long serialVersionUID = 5597545262767229022L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private long userId;
	
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
	@Column(name="avater_path")
	private String avatarPath;
	
	@Column(name = "gender")
	@Enumerated(EnumType.STRING)
	private GenderEnum gender;
	
	@Column(name="birthday")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate birthday;
	
	@Column(name="created_at")
	private LocalDateTime createdAt;
	@Column(name="update_at")
	private LocalDateTime updateAt;
	@Column(name="last_login")
	private LocalDateTime lastLogin;
	
	@OneToOne(mappedBy = "users",fetch = FetchType.LAZY)
	private Accounts account;
	
	@OneToMany(mappedBy = "user")
	@Column(name="delivery_address_id")
	private Set<DeliveryAddress> listDeliveryAddresses;
	
	@OneToOne(mappedBy = "user",fetch = FetchType.LAZY)
	private Carts cart;
}
