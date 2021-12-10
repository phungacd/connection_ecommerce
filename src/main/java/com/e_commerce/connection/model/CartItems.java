package com.e_commerce.connection.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="cart_item")
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@IdClass(CartItemPK.class)
public class CartItems implements Serializable{

	private static final long serialVersionUID = -5864523027821442941L;

	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="product_id",referencedColumnName = "product_id")
	private Products products;
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="cart_id",referencedColumnName = "cart_id")
	private Carts carts;
	
	@Column(name="quantity")
	private BigDecimal toltalPrice;
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="created_at")
	private LocalDateTime createdAt;
	@Column(name="update_at")
	private LocalDateTime updateAt;
}
