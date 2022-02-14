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


	float offset = 0;
	
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
				//d, e 0 -- start and end of the end range
				//map(-2,10,90,200,233)

				//line(10, 10, 250, 150);
				//color(255, 0, 0);
				break;
			case 2:
				background(0);
				int circles = (int) (mouseX / 20.0f);
				float r = width / 2;
				float q = height / 2;
				for(int i = 0; circles > i; i--)
				{
					noStroke();
					fill(map(i, 0, circles, 20, 200), 255, 255);
					ellipse(100, 100, 100, 100);
				}
				break;
			case 3:
			{
				background(0);
				int circlee = (int) (mouseX / 20.0f);
				float d = width / (float) circlee;
				for(int i = 0; i < circlee; i++)
				{
					noStroke();
					fill(map(i,0,circlee,0,255), 255, 255);
					circle(map(i,0,circlee - 1, d / 2.0f, width - (d / 2.0f)), 255, 255);
				}
				break; 
			}

			case 4:
			{
				background(0);
				int circlee = (int) (mouseX / 20.0f);
				offset += mouseY;
				float d = width / (float) circlee;
				for(int j = 0; j < circlee; j++)
				{
					for(int i = 0; i < circlee; i++)
					{
						noStroke();
						float c = map((i + j + offset), 0, circlee * 2, 0, 255) % 256;
						fill(c, 255, 255);
						float x = map(i, 0, circlee - 1, d / 2.0f, width - (d / 2.0f));
						
						circle(map(i,0,circlee - 1, d / 2.0f, width - (d / 2.0f)), 255, 255);
					}
					
				}
				break; 
			}
		}
	}
}
