package model;

import processing.core.PApplet;
import view.Main;

public class Logica extends Main{
private int click;
Omero om[];
private PApplet app;

private int pint;

  
	public Logica(PApplet app){
		
		this.app=app;
		
		
	    Thread hom =new Thread(new Omero(this));
		
		hom.start();
	

	
		
	}
	
	public void pintar() {
		
		
		for(pint=0;pint<om.length;pint+=0) {
			om[pint].pintar();
			
			
		}
		if(app.mousePressed==true) {
		for(int i=0;i<om.length;i++) {
			if(  app.mouseX> om[i].getPosX() && app.mouseX<om[i].getPosX()+100 && app.mouseY> om[i].getPosY()
					&& app.mouseY<om[i].getPosY()+100 ) {
				om[i].mover();
				
			}
		}
		
		
		}
		
		
	}
	
	public void mousePressed() {
		
	
		
		pint++;
		
		
	}
}
