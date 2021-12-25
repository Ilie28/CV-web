package com.iliealexandru.sweatshirtsstore.hoodies;

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

import com.iliealexandru.sweatshirtsstore.hoodies.Hoodie;
import com.iliealexandru.sweatshirtsstore.hoodies.HoodieService;

@Controller
public class HoodieController extends HoodieService {

	@Autowired
	private HoodieService HoodieService;
	
	@RequestMapping("/hoodie")
	public String getAllHoodie(Model model) {
		List<Hoodie> Hoodie = HoodieService.getAllHoodie();
		model.addAttribute("Hoodie", Hoodie);
		return "Hoodie";
	}
	
	@RequestMapping("/hoodie/{id}")
	public Hoodie getHoodie(@PathVariable Long id) {
		return HoodieService.getHoodie(id);
	}
	
	@RequestMapping("/addHoodie")
	public String addHoodieService(Hoodie Hoodie) {
		HoodieService.addHoodie(Hoodie);
		return"addHoodie";
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/hoodie/{id}")
	public void updateHoodie(@RequestBody Hoodie Hoodie, @PathVariable Long id) {
		HoodieService.updateHoodie(id, Hoodie);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/hoodie/{id}")
	public void deleteHoodie(@PathVariable Long id) {
		HoodieService.deleteHoodie(id);
	}
	
}
