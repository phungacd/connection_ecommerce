package com.e_commerce.connection.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="discounts")
public class Discounts implements Serializable {

	private static final long serialVersionUID = 3351754410066483495L;

	@Id
	@Column(name="discount_id")
	private long discountId;
	
	@Column(name = "discount_percent")
	private float discountPercent;
	@Column(name = "discount_unit")
	private float discountUnit;
	@Column(name = "discount_unit")
	private float discountMax;
	@Column(name = "discount_cart_min")
	private float discountCartMax;
	
	@Column(name="statusDiscount")
	@Enumerated(EnumType.STRING)
	private StatusDiscountEnum statusDiscount;
	
	@Column(name="discount_start")
	private LocalDateTime discountStart;
	@Column(name="discount_end")
	private LocalDateTime discountEnd;
	
	
}
