package view;

import model.Logica;
import processing.core.PApplet;

public class Main extends PApplet{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PApplet.main(Main.class.getName());
	}
	
	Logica log;
	
	public void settings() {
		
		size(800,800);
	}
	
	public void setup() {
		log = new Logica(this);

	}
	
	public void draw() {
		background(255,255,255);
		log.pintar();
		
		
		
	}

}
