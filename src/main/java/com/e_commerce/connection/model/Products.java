package com.e_commerce.connection.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

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
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name ="products")
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Products implements Serializable {

	private static final long serialVersionUID = -4082707057320045091L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private long productId;
	
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
	private LocalDateTime lastModifiedDate;
	
	
	@Column(name ="status")
	@Enumerated(EnumType.STRING)
	private StatusEnum status;
	
	@OneToMany (mappedBy = "productImageID")
	@Column(name="img_id")
	private Set<ProductImages> listProductImage ;
	
	@Column(name="review_id")
	@OneToMany(mappedBy = "productReviewId")
	private Set<ProductReviews> listProductsReviews ;
	
	
	@OneToMany(mappedBy = "products")
	@Column(name="product_catogory_id")
	private Set<ProductCategorys> listProductCategorys;
	
	@OneToMany(mappedBy = "products")
	@Column(name="cart_item_id")
	private Set<CartItems> listCartItem;
	
	//hinh anh
	// danh gia
	// chi tiet hoa don
	// danh muc
	// nguoi dung
	// khuyen mai
	//
	
	
	
	
	
}
