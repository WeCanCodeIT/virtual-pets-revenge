package org.wecancodeit.virtualpetsrevenge;

public class VirtualPet {
	
	private Long id;

	private String name;
	private String description;
	private int hunger;
	private int thirst;
	private int happiness;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getHappiness() {
		return happiness;
	}

	public VirtualPet(Long id, String name, String description, int hunger, int thirst, int happiness) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.hunger = hunger;
		this.thirst = thirst;
		this.happiness = happiness;
	}

}
