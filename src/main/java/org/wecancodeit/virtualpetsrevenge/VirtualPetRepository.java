package org.wecancodeit.virtualpetsrevenge;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class VirtualPetRepository {

	private Map<Long, VirtualPet> pets = new HashMap<>();

	public VirtualPetRepository() {
		VirtualPet petOne = new VirtualPet(1L, "Polly", "A brightly colored parrot", 10, 10, 10);
		VirtualPet petTwo = new VirtualPet(2L, "Todd", "A skateboarding dog", 10, 10, 10);
		VirtualPet petThree = new VirtualPet(3L, "Karl", "A boring turtle", 10, 10, 10);
		VirtualPet petFour = new VirtualPet(4L, "Lindsey", "A lazy cat", 10, 10, 10);
		
		addPet(petOne);
		addPet(petTwo);
		addPet(petThree);
		addPet(petFour);
	}

	private void addPet(VirtualPet pet) {
		pets.put(pet.getId(), pet);
	}

	public Collection<VirtualPet> findPets() {
		return pets.values();
	}

	public VirtualPet findById(Long id) {
		return pets.get(id);
	}
	
	
}
