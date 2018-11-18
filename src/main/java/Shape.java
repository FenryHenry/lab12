import java.awt.Color;
import java.awt.Point;
/**
 * This class maintains information for the abstract shape object.
 * 
 * @author Peyton
 * @version 2018-04-02
 * Lab 11
 */
public abstract class Shape implements Drawable
{
    protected Point[] location;
    
    private Color color;
    
    private boolean filled;
    
    /**
     * Constructor for the shape class
     * @param color
     * @param filled
     */
    public Shape(Color color, boolean filled)
    {
        this.color = color;
        this.filled = filled;       
    }
    
    /**
     * Returns the color of the shape
     * @return
     */
    public Color getColor()
    {
        return color;
    }
    
    /**
     * Returns if the shape is filled or not
     * @return
     */
    public boolean isFilled()
    {
        return filled;
    }
    
    /**
     * Returns the location of the shape
     * @return
     */
    public Point[] getLocation()
    {
        return location;
    }
    
}
