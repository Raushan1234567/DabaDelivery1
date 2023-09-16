package com.delivery.service;

import java.util.List;

import com.delivery.model.Cart;


public interface CartServiceInterface {

	Cart addToCart( Cart cart,Integer customerId);

	Cart addMed(Integer medicineId, Integer cartId);

	List<Cart> getMed();

}
