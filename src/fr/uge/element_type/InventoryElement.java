package fr.uge.element_type;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InventoryElement extends Element {
	private ArrayList<InventoryElement> listInventory;
	
	public InventoryElement() {
		this.listInventory = new ArrayList<>();
	}
	
	
	
	public void addInventory(InventoryElement elem) {
		Objects.requireNonNull(elem);
		listInventory.add(elem);
	}
	
	
	
	public List<InventoryElement> displayListInventory(){
		return List.copyOf(listInventory);
	}
	
	
	
}
