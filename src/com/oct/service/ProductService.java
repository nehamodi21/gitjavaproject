package com.oct.service;

import com.oct.model.Product;

public interface ProductService {
	// Declaring constant for Error msg
	// constant must be declared as static final along with name of variable in all
	// capital..
	// interface variables are by default static final
	// predefined constants are fix ..
	public String PRODUCT_SUCCESS = "Product Added Successfully...!";
	public String PRODUCT_ERROR = "Problem in product add...!";
	public String DUPLICATE_PRODUCT = "Duplicate Product...!";

//Declaring Services
	public String addProduct(Product prod);

	public boolean deleteProduct(DeleteCriteria criteria,String val);

	public Product updateProduct(int prID, Product newValue);

	public Product[] listProduct();

	public double argFunctionsProduct(ArgFunction function);

	public Product searchProduct(SearchCriteria type, String val);

	public Product[] checkProductRangePrice(double startRange, double endRange);

}

//Declaring ENUM for Search criteria via id,name,vendor,category

enum SearchCriteria {
	ID, NAME, VENDOR, CATEGORY

}

//Declaring ENUM for Aggregate Function
enum ArgFunction {
	COUNT, MIN, MAX, AVG
}

//Declaring ENUM For DeleteCriteria via ID and Category

enum DeleteCriteria {
	ID, CATEGORY
}
