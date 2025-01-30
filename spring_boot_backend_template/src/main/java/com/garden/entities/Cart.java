package com.garden.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Cart")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cart extends BaseEntity{
	
	
		
		
		@Column(name="Cart_id")
		private Long Cid;
		
		@Column(name = "quantity", nullable = false)
		private int quantity;
		
		@Column(name = "ProductName",nullable = false)
		private String pname;
		
		@Column(name = "PricePerProduct",nullable = false)
		private int price;
		
		@Column(name = "bill", nullable = false)
		private double bill;
		
		@OneToOne
		@JoinColumn (name="uid",nullable = false)
		private User user;
		
		@OneToOne
		@JoinColumn (name="pid",nullable = false)
		private Product product;
		
		

}
