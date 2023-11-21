package fr.uge.graphique;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Objects;

import javax.imageio.ImageIO;

import fr.uge.element.foods.Banana;


public class Graphique extends Banana{
	private final fr.umlv.zen5.ApplicationContext context;
	private final int sizeCase = 80;
	private final int sizeCasePlayerPlateau = 40;

	
	/**
	 * constructor of the graphic object allowing to reduce several calls to context
	 * @param context element allowing to edit on the graphic window of the game
	 */
	public Graphique(fr.umlv.zen5.ApplicationContext context){
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
	
	
	
	
	
	
	
	
	
	
	
	
}
