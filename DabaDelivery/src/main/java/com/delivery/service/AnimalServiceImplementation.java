package com.delivery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delivery.model.AnimalMedicine;
import com.delivery.model.Medicine;
import com.delivery.repositry.AnimalMedicineRepositry;
import com.delivery.repositry.MedicineRepositry;



@Service
public class AnimalServiceImplementation implements AnimalServiceInterface {

	@Autowired
	private AnimalMedicineRepositry medicineRepositry; 
	
	@Override
	public AnimalMedicine addMedicine(AnimalMedicine medicine) {
		// TODO Auto-generated method stub
		
		return medicineRepositry.save(medicine);
	}

}
