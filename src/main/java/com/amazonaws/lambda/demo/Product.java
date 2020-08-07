package com.amazonaws.lambda.demo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * The persistent class for the product database table.
 * 
 */
@Entity(name = "items")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int productId;

	private String productName;

	private double productsellingPrice;

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductsellingPrice() {
		return this.productsellingPrice;
	}

	public void setProductsellingPrice(double productsellingPrice) {
		this.productsellingPrice = productsellingPrice;
	}

}