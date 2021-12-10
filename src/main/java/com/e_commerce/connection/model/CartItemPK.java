package com.e_commerce.connection.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CartItemPK implements Serializable{

	private static final long serialVersionUID = 3376017415764008755L;
	private long cart;
	private long product;
	
	public CartItemPK(long cart, long product) {
		super();
		this.cart = cart;
		this.product = product;
	}
	public CartItemPK() {
		super();
	}
	public long getCart() {
		return cart;
	}
	public void setCart(long cart) {
		this.cart = cart;
	}
	public long getProduct() {
		return product;
	}
	public void setProduct(long product) {
		this.product = product;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cart ^ (cart >>> 32));
		result = prime * result + (int) (product ^ (product >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartItemPK other = (CartItemPK) obj;
		if (cart != other.cart)
			return false;
		if (product != other.product)
			return false;
		return true;
	}


}
