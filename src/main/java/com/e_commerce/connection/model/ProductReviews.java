package com.e_commerce.connection.model;

import java.io.Serializable;
import java.time.LocalDate;

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
@Table (name ="product_reviews")
@AllArgsConstructor
public class ProductReviews implements Serializable {

	private static final long serialVersionUID = -3355213909823879180L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="product_review_id")
	private long productReviewId;
	@Column(name="rating")
	private int rating;
	
	@Column(name="created_date")
	private LocalDate created_date;	
	@Column(name="status")
	private boolean status;
	
	@Column(name="content",columnDefinition = "TEXT")
	private String content;
	@Column(name="titile",columnDefinition = "varchar (255)")
	private String title;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="product_id",referencedColumnName = "id")
	private Products product;
	
	
}
