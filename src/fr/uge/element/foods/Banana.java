package fr.uge.element.foods;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Objects;

import javax.imageio.ImageIO;

import fr.uge.element_type.Food;
import fr.uge.interfaces.ElementsAffichables;
import fr.umlv.zen5.ApplicationContext;

public class Banana extends Food implements ElementsAffichables {
	private ApplicationContext context;
	
	public Banana() {
		Objects.requireNonNull(context);
		this.context = context;
	}
	
	

	
	public void afficheImage(String path, int x, int y, int width, int height){
		try {
			var image = ImageIO.read(new File(Paths.get(System.getProperty("user.dir") + path).toString()));
			context.renderFrame(graphics -> {
			graphics.drawImage(image, x  , y , width,  height, null);
			});
		}catch (IOException a) {
			a.printStackTrace();
		}
	}
	
	
	@Override
	public void display() {
		afficheImage("/data/Images/BANANA.png", 250, 700 , 200, 150);
	}
}
