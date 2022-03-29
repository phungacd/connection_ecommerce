package com.e_commerce.connection.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.e_commerce.connection.commom.StatusEnum;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="accounts")
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Accounts implements Serializable{

	private static final long serialVersionUID = 2088965809881583761L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="account_id")
	private long accountId;
	
	@Column(name="email_name",columnDefinition = "varchar(30)")
	private String emailName;
	@Column(name="account_name",columnDefinition = "varchar(30)")
	private String accountName;
	@Column(name="phone_number",columnDefinition = "varchar(30)")
	private String phoneNumber;
	@Column(name="password",columnDefinition = "varchar(50)")
	private String passWord;
	@Column(name="confirm_email")
	private String confirmEmail;
	
	@Column(name="status")
	@Enumerated(EnumType.STRING)
	private StatusEnum status;
	
	@Column(name="created_at")
	private LocalDateTime createdAt;
	@Column(name="last_login")
	private LocalDateTime lastLogin;
	
	@OneToMany(mappedBy = "account")
	@Column(name="account_role_id")
	private Set<AccountRoles> listAccountRole;
	
	@OneToOne
	@JoinColumn(name="user_id",referencedColumnName = "user_id")
	private Users user;
}
