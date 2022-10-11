package com.oct.model;

public class Product {

	private int prodId;
	private String prodName;
	private String prodVendor;
	private String prodCategory;
	private int prodQty;
	private double prodPrice;
	
	public Product(int prodId, String prodName, String prodVendor, String prodCategory, int prodQty, double prodPrice) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodVendor = prodVendor;
		this.prodCategory = prodCategory;
		this.prodQty = prodQty;
		this.prodPrice = prodPrice;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\n Product [prodId=" + prodId + ", prodName=" + prodName + ", prodVendor=" + prodVendor + ", prodCategory="
				+ prodCategory + ", prodQty=" + prodQty + ", prodPrice=" + prodPrice + "]";
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdVendor() {
		return prodVendor;
	}

	public void setProdVendor(String prodVendor) {
		this.prodVendor = prodVendor;
	}

	public String getProdCategory() {
		return prodCategory;
	}

	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}

	public int getProdQty() {
		return prodQty;
	}

	public void setProdQty(int prodQty) {
		this.prodQty = prodQty;
	}

	public double getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	
	
	

}
