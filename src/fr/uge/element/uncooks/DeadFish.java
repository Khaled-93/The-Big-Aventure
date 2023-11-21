package fr.uge.element.uncooks;

import fr.uge.element_type.UneatableUncooked;
import fr.uge.interfaces.ElementsAffichables;

public class DeadFish extends UneatableUncooked implements ElementsAffichables {
	private boolean cooked;
	public DeadFish() {
		this.cooked = false;
	}
	
	@Override
	public void isCooked() {
		this.cooked = true;
	}
	
}
