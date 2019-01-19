/*package com.packt.webstore.validator;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.packt.webstore.domain.Product;
import com.packt.webstore.exception.ProductNotFoundException;
import com.packt.webstore.service.ProductService;

public class CategoryValidator implements ConstraintValidator<Category, String>{
	
	@Autowired
	private ProductService productService;
	
	
	public CategoryValidator() {
		List<String> allowedCategories = new ArrayList<String>();
	}
	
	public boolean isValid(String value, ConstraintValidatorContext context) {
		Product product;
		try {
			product = productService.getProductsByCategory(value);
		} catch (ProductNotFoundException r) {
			return true;
		}
		if(product != null) {
			return false;
		}
		return true;
	}

	public void initialize(Category constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}
	
}
*/