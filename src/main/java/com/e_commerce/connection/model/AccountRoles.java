package com.e_commerce.connection.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@IdClass(AccountRolePK.class)
@Table(name="account_roles")
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class AccountRoles  implements Serializable{
	private static final long serialVersionUID = -8698058005054218700L;

	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id",referencedColumnName = "id")
	private Roles role;
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="account_id",referencedColumnName = "id")
	private Accounts account;
	
	@Column(name="status")
	@Enumerated(EnumType.STRING)
	private StatusEnum status;
	
	@Column(name="created_at")
	private LocalDateTime createdAt;
	@Column(name="update_at")
	private LocalDateTime updateAt;
	
}
