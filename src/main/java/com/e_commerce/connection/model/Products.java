package com.e_commerce.connection.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;


@Entity
@AllArgsConstructor
@Table(name ="products")
public class Products implements Serializable {

	private static final long serialVersionUID = -4082707057320045091L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name ="product_name",columnDefinition = "nvarchar(255)")
	private String productName;
	@Column(name ="description",columnDefinition = "TEXT")
	private String description;
	@Column(name ="trademark",columnDefinition = "nvarchar(255)")
	private String trademark;
	
	@Column(name ="quantity")
	private long quantity;
	@Column(name ="quantity_sold")
	private long quantitySold;
	
	@Column(name ="price")
	private BigDecimal price;
	
	@Column(name ="created_date")
	private LocalDateTime createdDate;
	@Column(name ="last_modified_date")
	private LocalDateTime lastModifiedMdate;
	
	
	@Column(name ="status")
	@Enumerated(EnumType.STRING)
	private StatusEnum status;
	
	@OneToMany (mappedBy = "productImageID",cascade = CascadeType.ALL)
	@Column(name="img_id")
	private Set<ProductImages> listProductImage ;
	@Column(name="review_id")
	@OneToMany(mappedBy = "productReviewId")
	private Set<ProductReviews> listProductsReviews ;
	
	//hinh anh
	// danh gia
	// chi tiet hoa don
	// danh muc
	// nguoi dung
	// khuyen mai
	//
	
	
	
	
	
}
