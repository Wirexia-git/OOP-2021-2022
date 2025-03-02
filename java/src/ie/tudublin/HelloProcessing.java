package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(RGB);
		//background(0);

		x1 = random(0, width);
		x2 = random(0, width);
		y1 = random(0, height);
		y2 = random(0, height);

		float range = 5;

		x1dir = random(-range, range);
		x2dir = random(-range, range);
		y1dir = random(-range, range);
		y2dir = random(-range, range);

		smooth();
		
	}

	float x1, y1, x2, y2;
	float x1dir, x2dir, y1dir, y2dir;
	float c = 0;
	
	public void draw()
	{	
		background(255, 255, 0);				//greyscale
		line(10, 10, 200, 200);		//x1, y1, x2, y2
		circle(300, 250, 50);		//cx, cy, r
		ellipse(50, 200, 90, 200);	//cr, cy, w, h

		rectMode(CENTER);
		rect(300, 20, 100, 20);		//tlx, tly, w, h
		
		rectMode(CORNER);
		rect(200, 20, 100, 20);		//tlx, tly, w, h

		point(20, 300);

		triangle(10, 400, 50, 450, 300, 200);	
	}
}
