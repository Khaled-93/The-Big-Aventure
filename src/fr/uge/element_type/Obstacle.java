package fr.uge.element_type;

import fr.uge.element.enums.FootState;

public class Obstacle extends MapElement {
	Element element_needed_to_pass_through() {
		return null;
	}
	
	FootState footstate_needed_to_pass_through() {
		return null;
	}
}
