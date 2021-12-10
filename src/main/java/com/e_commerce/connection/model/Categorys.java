package com.e_commerce.connection.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="categorys")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Categorys implements Serializable{

	private static final long serialVersionUID = 9115552728143643459L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="category_id")
	private long categoryId;
	@Column(name="parent_id")
	private long parentId;
	
	@Column(name="titile")
	private String title;
	
	@Column(name="created_at")
	private LocalDateTime createdAt;
	@Column(name="update_at")
	private LocalDateTime updateAt;
	
	@OneToMany(mappedBy = "categorys")
	@Column(name="product_category_id")
	private Set<ProductCategorys> listProductCatogory;
	
}
