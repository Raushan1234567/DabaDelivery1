package com.delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.model.Cart;
import com.delivery.service.CartServiceInterface;

import jakarta.validation.Valid;

@RestController
public class CartController {
	@Autowired
	private CartServiceInterface cartServiceInterface;
	
	@PostMapping("/cart/{customerId}")
	public ResponseEntity<Cart> addCart(@Valid @RequestBody Cart cart,@PathVariable Integer customerId){
		return new ResponseEntity<Cart>(cartServiceInterface.addToCart(cart,customerId),HttpStatus.CREATED);
	}
	@PostMapping("/addToCart/{cartId}/{medicineId}")
	public ResponseEntity<Cart> addMedcine(@PathVariable Integer medicineId, @PathVariable Integer cartId){
		return new ResponseEntity<Cart>(cartServiceInterface.addMed(medicineId,cartId),HttpStatus.CREATED);
	}
	
	@GetMapping("/carts")
	public ResponseEntity<List<Cart>> getMedcine(){
		return new ResponseEntity<List<Cart>>(cartServiceInterface.getMed(),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/carts/{cartId}/{medicineId}")
	public ResponseEntity<Cart> deleteMedcine(@PathVariable Integer cartId,@PathVariable Integer medicineId ){
		return new ResponseEntity<Cart>(cartServiceInterface.deleteMed(medicineId,cartId),HttpStatus.CREATED);
	}
}

