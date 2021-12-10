package com.e_commerce.connection.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;

@Entity
@Table(name ="categorys")
@AllArgsConstructor
public class Categorys implements Serializable{

	private static final long serialVersionUID = 9115552728143643459L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="category_id")
	private long categoryId;
	
	
}
