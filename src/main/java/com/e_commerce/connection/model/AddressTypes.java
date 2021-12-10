package com.e_commerce.connection.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="delivery_address_types")
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class AddressTypes implements Serializable{

	private static final long serialVersionUID = 3361769988140284162L;

	
	@Id
	@Column(name="address_type_id")
	private long AddressTypeId;
	
	@Column(name="addressName",columnDefinition = "text")
	private String addressName;
	
	@Column(name="created_at")
	private LocalDateTime createdAt;
	@Column(name="update_at")
	private LocalDateTime updateAt;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "delivery_address_id",columnDefinition = "delivery_address_id")
	private DeliveryAddress deliveryAddress;
}
