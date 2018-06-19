package org.wecancodeit.virtualpetsrevenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VirtualPetController {
	
	@Autowired
	VirtualPetRepository repo;

	@RequestMapping("/")
	public String home() {
		return "redirect:/pets";
	}

	@RequestMapping("/pets")
	public String getPets(Model model) {
		model.addAttribute("pets", repo.findPets());
		return "pets";
	}
	
	@RequestMapping("/pets/{id}")
	public String getPet(@PathVariable(name="id") Long id, Model model) {
		model.addAttribute("pet", repo.findById(id));
		return "pet";
	}
}
