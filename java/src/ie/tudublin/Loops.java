package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{


	int mode = 0;

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(RGB);
		
	}

	public void keyPressed()
	{
		if (key >= '0' && key <='9')
		{
			mode = key - '0';
		}
		println(mode);
	}

	
	public void draw()
	{
		
		switch(mode)	
		{
			case 0:
				rect(150, 200, 200, 100);
				color(0, 128, 0);
				break;
			case 1:
				line(10, 10, 250, 150);
				color(255, 0, 0);
				break;
			case 2:
				break;
		}
	}
}
