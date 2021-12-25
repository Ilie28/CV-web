package com.iliealexandru.sweatshirtsstore.hoodies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iliealexandru.sweatshirtsstore.product.Product;
import com.iliealexandru.sweatshirtstore.sweatshirt.Sweatshirts.Gender;

@Service
public class HoodieService {

	@Autowired
	private HoodieRepository HoodieRepository;

	public List<Hoodie> getAllHoodie() {
		List<Hoodie> Hoodie = new ArrayList<>();
		HoodieRepository.findAll().forEach(Hoodie::add);
		return Hoodie;
	}
	
	public Hoodie getHoodie(Long id) {
		return HoodieRepository.findById(id).get();
	}

	public void addHoodie(Hoodie Hoodie) {
		HoodieRepository.save(Hoodie);
	}

	public void updateHoodie(Long id, Hoodie Hoodie) {
		HoodieRepository.save(Hoodie);
	}

	public void deleteHoodie(Long id) {
		HoodieRepository.deleteById(id);
	}	
}