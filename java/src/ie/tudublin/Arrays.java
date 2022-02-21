package ie.tudublin;

public class Arrays 
{
        
}

public void setup()
{
    for(int i = 0; i < rainfall.length; i++)
    {
        println(rainfall[i] + "\t" + months[i]);
    }

    for(float r:rainfall)
    {
        println(r);
    }

    int j = 0;
    for(float r:rainfall)
    {
        println(r + "\t" + months[j]);
        j++
    }

    for(int i = rainfall.length - 1; i >= 0; i--)
    {
        println(rainfall[i] + "\t" + months[i]);
    }
}

public void draw()
{

}