package com.e_commerce.connection.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="delivery_address")
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryAddress implements Serializable{

	private static final long serialVersionUID = -3027629014124210213L;

	@Id
	@Column(name="delivery_address_id")
	private long deliveryAddressid;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="phone_number")
	private String phoneNumber;
	@Column(name="addressDetail")
	private String addressDetail;
	
	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	private StatusDeliveryAddressEnum status;
	
	@Column(name="created_at")
	private LocalDateTime createdAt;
	@Column(name="update_at")
	private LocalDateTime updateAt;
	
	@OneToMany(mappedBy = "deliveryAddress")
	@Column(name="address_type-id")
	private Set<AddressTypes> listAddressType;
	
	@ManyToOne
	@JoinColumn(name = "user_id",referencedColumnName = "user_id")
	private Users user;
}
