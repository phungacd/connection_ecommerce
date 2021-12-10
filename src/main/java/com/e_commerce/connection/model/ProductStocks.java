package com.e_commerce.connection.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_stocks")
public class ProductStocks implements Serializable{

	private static final long serialVersionUID = 618396763096435025L;

	@Id
	@Column(name="product_stock_id")
	private long productStockId;
	
	
}
