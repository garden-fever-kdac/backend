package com.garden.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Product")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product extends BaseEntity {
	
	@Column(name = "p_name", nullable = false, length = 30)
	private String pname;
	
	@Column(name = "p_price", nullable = false)
	private int price;
	
	@Column(nullable = false)
	private int availableQuantity;
	
	@Column(name = "url")
	private String imageUrl;
	
	@Lob
	private byte[] image;
	
	
	
	

}
