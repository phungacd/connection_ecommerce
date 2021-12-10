package com.e_commerce.connection.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;


@Entity
@Table(name ="product_images")
@AllArgsConstructor
public class ProductImages implements Serializable {

	private static final long serialVersionUID = -891859817423506464L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_image_id")
	private long productImageID;
	
	@Column(name ="image_url",columnDefinition = "varchar(255)")
	private String imageUrl;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn (name ="product_id",referencedColumnName = "product_id")
	private Products product;
	
	
}
