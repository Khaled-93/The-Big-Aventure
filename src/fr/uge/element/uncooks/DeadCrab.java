package fr.uge.element.uncooks;

import fr.uge.element_type.UneatableUncooked;
import fr.uge.interfaces.ElementsAffichables;

public class DeadCrab extends UneatableUncooked implements ElementsAffichables{
	private boolean cooked ;
	public DeadCrab() {
		this.cooked = false;
	}
	
	
	@Override
	public void isCooked() {
		this.cooked = true;
	}
}
