package com.iliealexandru.sweatshirtstore.sweatshirt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iliealexandru.sweatshirtstore.sweatshirt.Sweatshirts;
import com.iliealexandru.sweatshirtstore.sweatshirt.SweatshirtsService;

@Controller
public class SweatshirtsController extends SweatshirtsService {

	@Autowired
	private SweatshirtsService SweatshirtsService;
	
	@RequestMapping("/sweatshirts")
	public String getAllSweatshirts(Model model) {
		List<Sweatshirts> Sweatshirts = SweatshirtsService.getAllSweatshirts();
		model.addAttribute("Sweatshirts", Sweatshirts);
		return "Sweatshirts";
	}
	
	@RequestMapping("/sweatshirts/{id}")
	public Sweatshirts getSweatshirts(@PathVariable Long id) {
		return SweatshirtsService.getSweatshirts(id);
	}
	
	@RequestMapping("/addSweatshirts")
	public String addSweatshirtsService(Sweatshirts Sweatshirts) {
		SweatshirtsService.addSweatshirts(Sweatshirts);
		return"addTshirt";
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/sweatshirts/{id}")
	public void updateSweatshirts(@RequestBody Sweatshirts Sweatshirts, @PathVariable Long id) {
		SweatshirtsService.updateSweatshirts(id, Sweatshirts);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/sweatshirts/{id}")
	public void deleteSweatshirts(@PathVariable Long id) {
		SweatshirtsService.deleteSweatshirts(id);
	}
	
}
