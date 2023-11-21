package fr.uge.element_type;

import fr.uge.element.enums.FootState;

public class Wall extends Obstacle {
	
	@Override
	FootState footstate_needed_to_pass_through() {
		return FootState.FLOATING;
	}
}
