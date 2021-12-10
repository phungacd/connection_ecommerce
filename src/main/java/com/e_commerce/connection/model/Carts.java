package com.e_commerce.connection.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="cart")
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Carts implements Serializable{

	private static final long serialVersionUID = -7601048426995699996L;
	
	@Id
	@Column(name="cart_id")
	private long cartId;
	
	@Column(name="total_price")
	private BigDecimal toltalPrice;
	@Column(name="created_at")
	private LocalDateTime createdAt;
	@Column(name="update_at")
	private LocalDateTime updateAt;
	
	@OneToOne(mappedBy = "userId")
	@Column(name="user_id")
	private Users users;
	
	@OneToMany
	@JoinColumn(name = "cart_item_id",referencedColumnName = "cart_item_id")
	private Set<CartItems> listCartItem;
}
