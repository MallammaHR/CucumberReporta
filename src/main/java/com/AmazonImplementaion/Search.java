package com.AmazonImplementaion;

public class Search 
{
	String search;
	
	public String displayTheproduct(Product product)
	{
		if(product.getProductList().contains(product.getProductName()))
				{
					return product.getProductName();
				}
			return null;
	
	}

}
