package com.e_commerce.connection.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ProductCategoryPk implements Serializable{

	private static final long serialVersionUID = 2815305223627860527L;

	private long category;
	private long product;

	public ProductCategoryPk() {
		super();
	}
	public ProductCategoryPk(long category, long product) {
		super();
		this.category = category;
		this.product = product;
	}
	public long getCategory() {
		return category;
	}
	public void setCategory(long category) {
		this.category = category;
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
		result = prime * result + (int) (category ^ (category >>> 32));
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
		ProductCategoryPk other = (ProductCategoryPk) obj;
		if (category != other.category)
			return false;
		if (product != other.product)
			return false;
		return true;
	}


}
