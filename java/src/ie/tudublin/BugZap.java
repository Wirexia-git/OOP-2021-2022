package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet 
{

    float playerX = 250;
    float playerY = 10;
    float playerWidth = 1000;
    
    public void settings()
    {
        size(1000, 1000);
    }

    public void setup()
    {
        colorMode(RGB);

        /*playerX = width / 2;
        playerY = height - 50;
        playerWidth = 50;
        */
        smooth();
    }

    public void draw()
    {
        background(255,255,255);

        drawPlayer(playerX, playerY, playerWidth);
    }

    void drawPlayer(float x, float y, float w)
    {
        float h = w/2;
        line(x + 300, 980, x + 200, 980);
        line(x + 300, 980, x + 300, 930);
        line(x + 200, 980, x + 200, 930);
        line(x + 300, 930, x + 270, 900);
        line(x + 200, 930, x + 230, 900);
        line(x + 270, 900, x + 230, 900);
        line(x + 250, 900, x + 250, 870);
    }

    public void keyPressed()
    {
        if (keyCode == LEFT)
        {
            if (playerX == -200 || playerX < -200)
            {
                System.out.println("STOP");
            }

            else
            {
                System.out.println("Left arrow pressed");
                playerX = playerX - 30;
                System.out.println(playerX);
            }
        }

        if (keyCode == RIGHT)
        {
            if (playerX == 700 || playerX > 700)
            {
                System.out.println("STOP");
            }

            else 
            {
                System.out.println("Right arrow pressed");
                playerX = playerX + 30;
                System.out.println(playerX);
            }

        }

        if (key == ' ')
        {
            System.out.println("SPACE key pressed");
        }
    }

}
