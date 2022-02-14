package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{


	int mode = 0;

	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		colorMode(HSB);
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
				background(0);
				int bars = (int) (mouseX / 20.0f);
				float w = width / (float)bars;
				for(int i = 0; i < bars; i++)
				{
					noStroke();
					fill(map(i, 0, bars, 0, 255), 255, 255);
					rect(map(i, 0, bars, 0, 500), 0, w, height);
				}

				//rect(150, 200, 200, 100);
				//color(0, 128, 0);
				break;
			case 1:
				background(0);
				int squares = (int) (mouseX / 20.0f);
				float h = width / (float) squares;
				for(int i = 0 ; i < squares ; i++)
				{
					noStroke();
					fill(map(i, 0, squares, 0, 255), 255, 255);
					float x = map(i, 0, squares, 0, width);
					rect(x, x, h, h);
					rect((width - h) - x, x, h, h);
				}
				//map(a,b,c,d,e);
				//a = inputvalue
				//b - c -- start and end of the first range
				// d, e 0 -- start and end of the end range
				//line(10, 10, 250, 150);
				//color(255, 0, 0);
				break;
			case 2:
				break;
		}
	}
}
