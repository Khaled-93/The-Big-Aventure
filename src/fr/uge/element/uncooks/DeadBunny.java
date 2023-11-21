package fr.uge.element.uncooks;

import fr.uge.element_type.UneatableUncooked;
import fr.uge.interfaces.ElementsAffichables;

public class DeadBunny extends UneatableUncooked implements ElementsAffichables {
	private boolean cooked;
	
	public DeadBunny() {
		this.cooked = false;
	}
	
	
	@Override
	public void isCooked() {
		this.cooked = true;
	}
}
