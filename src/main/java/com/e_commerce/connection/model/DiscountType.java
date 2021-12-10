package com.e_commerce.connection.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="discount_type")
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class DiscountType implements Serializable{

	private static final long serialVersionUID = -1733325661033083465L;

	@Id
	@Column(name="discount_type_id")
	private long discountTypeId;
	
	@Column(name="title")
	private String title;
	
	@Column(name="created_at")
	private LocalDateTime createdAt;
	@Column(name="update_at")
	private LocalDateTime updateAt;
	
	@OneToMany(mappedBy = "discount_id")
	@Column(name="discount_id")
	private Set<Discounts> discounts;
}
