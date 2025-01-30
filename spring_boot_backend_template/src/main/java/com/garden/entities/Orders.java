package com.garden.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")

public class Orders extends BaseEntity {
	@Column(nullable = false)
	private int quantity;
	@Column(nullable = false)
	private double bill;
	@Column(nullable = false,length=10)
	private String status;
	@Column(name = "order_date")
	private LocalDate odate;
	
	@ManyToOne
	@JoinColumn(name="uid",nullable = false)
	private User user;
	
	@OneToOne
	@JoinColumn(name="pid",nullable = false)
	private Product product;
}
