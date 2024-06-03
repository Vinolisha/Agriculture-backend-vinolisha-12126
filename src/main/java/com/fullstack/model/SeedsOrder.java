package com.fullstack.model;


import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Seedorder_table")
public class SeedsOrder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;
	
	@ManyToOne
	@JoinColumn(name="farmer_Id")
	private Farmer farmer;
	
	@ManyToOne
	@JoinColumn(name = "product_Id")
	private SellerProduct sellerProduct;
	
	@Column(name = "order_quantity")
	private int quantityOrdered;
	
	@Column(name = "order_date")
	private LocalDate orderDate;
	
	private Double totalAmount;
	
	
}
