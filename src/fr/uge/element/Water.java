package fr.uge.element;

import java.util.concurrent.Flow;

import fr.uge.element_type.BiomeElement;
import fr.uge.element_type.Skin;

public class Water extends BiomeElement {
	Flow flow;
	
	public Water(Flow flow , Position pos) {
		this.flow = flow;
		this.pos = pos;
	}
	
	
	
	@Override
	public String toString() {
		return ""; /*TODO*/
	}
	
}
