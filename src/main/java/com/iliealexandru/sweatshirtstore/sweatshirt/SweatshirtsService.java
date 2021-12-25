package com.iliealexandru.sweatshirtstore.sweatshirt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iliealexandru.sweatshirtsstore.product.Product;
import com.iliealexandru.sweatshirtstore.sweatshirt.Sweatshirts.Gender;

@Service
public class SweatshirtsService {

	@Autowired
	private SweatshirtsRepository SweatshirtsRepository;

	public List<Sweatshirts> getAllSweatshirts() {
		List<Sweatshirts> Sweatshirts = new ArrayList<>();
		SweatshirtsRepository.findAll().forEach(Sweatshirts::add);
		return Sweatshirts;
	}
	
	public Sweatshirts getSweatshirts(Long id) {
		return SweatshirtsRepository.findById(id).get();
	}

	public void addSweatshirts(Sweatshirts Sweatshirts) {
		SweatshirtsRepository.save(Sweatshirts);
	}

	public void updateSweatshirts(Long id, Sweatshirts Sweatshirts) {
		SweatshirtsRepository.save(Sweatshirts);
	}

	public void deleteSweatshirts(Long id) {
		SweatshirtsRepository.deleteById(id);
	}	
}
