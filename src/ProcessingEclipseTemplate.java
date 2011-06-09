import java.util.ArrayList;
import java.util.HashMap;

import processing.core.PApplet;
import toxi.geom.Rect;
import toxi.geom.Vec2D;
import toxi.physics2d.VerletParticle2D;
import toxi.physics2d.VerletPhysics2D;
import toxi.physics2d.VerletSpring2D;
import toxi.physics2d.behaviors.AttractionBehavior;

public class ProcessingEclipseTemplate extends PApplet {

	

	public void setup() {
		size(640, 480);
		println("hi!");
	
	}

	public void draw() {
		
	
	}
	

	public void mousePressed() {
		println("mouse pressed");
	}

	public void mouseDragged() {
		println("mouse dragged");
	}

	public void mouseReleased() {
		println("mouse released");
	}

	public void keyPressed() {
		println("key pressed:" + key);
	}



}
