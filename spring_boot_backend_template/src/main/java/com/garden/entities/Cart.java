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
		
		@Column(name="cart_id")
		private Long cid;
		
		@Column(nullable = false)
		private int quantity;
		
		@Column(name = "product_name",nullable = false)
		private String pname;
		
		@Column(nullable = false)
		private int price;
		
		@Column(nullable = false)
		private double bill;
		
		@OneToOne
		@JoinColumn (name="uid",nullable = false)
		private User user;
		
		@OneToOne
		@JoinColumn (name="pid",nullable = false)
		private Product product;
		
		

}
