
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Stephen, Peyton
 * @version 2018-04-02
 * Lab 11
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;
    
    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the panel.
     * 
     * @param title String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);
        
        int width = 800;
        int height = 600;
        
        // Base head:
        Circle base = new Circle(new Point(400, 300), 300, Color.BLACK, true);
        
        // Ears:
        RightTriangle outerLeft = new RightTriangle(new Point(275,235), 40, 150, Color.BLACK, true);
        RightTriangle innerLeft = new RightTriangle(new Point(280,235), 20, 100, Color.pink, true);

        RightTriangle outerRight = new RightTriangle(new Point(525,235), -40, 150, Color.BLACK, true);
        RightTriangle innerRight = new RightTriangle(new Point(520,235), -20, 100, Color.pink, true);
        
        // Eyes:
        Oval leftWhites = new Oval(new Point(340, 250), 50, 75, Color.WHITE, true);
        Oval leftPupil = new Oval(new Point(340, 250), 25, 65, Color.BLACK, true);

        Oval rightWhites = new Oval(new Point(460, 250), 50, 75, Color.WHITE, true);
        Oval rightPupil = new Oval(new Point(460, 250), 25, 65, Color.BLACK, true);
                
        // Nose and Whiskers:
        Circle nose = new Circle(new Point(400, 300), 40, Color.pink, true);
        PolyLine leftMouth = new PolyLine(new Point(330,350), new Point(400,360), 10, Color.white, true);
        PolyLine rightMouth = new PolyLine(new Point(400,360), new Point(470,350), 10, Color.white, true);
        Oval tongue = new Oval(new Point(420,375), 20, 35, Color.red, true);

        // Collar:  
        Oval collarStrap = new Oval(new Point(400,440), 340, 50, Color.green,true);
        Circle tags = new Circle(new Point(400,440), 60, Color.CYAN, true);
        Circle tagsInner = new Circle(new Point(400,440), 40, Color.red, false);

        
        
        // Outlines n stuff:
        Circle bigCirc = new Circle(new Point(400, 300), 600, Color.RED, false);
        Square square = new Square(new Point(400, 300), 424, Color.red, false);


        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();
        
        // Add shapes to the panel:
        drawPanel.addShape(base);
        drawPanel.addShape(outerLeft);
        drawPanel.addShape(innerLeft);
        drawPanel.addShape(outerRight);
        drawPanel.addShape(innerRight);
        drawPanel.addShape(leftWhites);
        drawPanel.addShape(leftPupil);
        drawPanel.addShape(rightWhites);
        drawPanel.addShape(rightPupil);
        drawPanel.addShape(nose);
        drawPanel.addShape(bigCirc);
        drawPanel.addShape(square);
        drawPanel.addShape(leftMouth);
        drawPanel.addShape(rightMouth);
        drawPanel.addShape(tongue);
        drawPanel.addShape(collarStrap);
        drawPanel.addShape(tags);
        drawPanel.addShape(tagsInner);
        
        // set background color
        drawPanel.setBackground(Color.LIGHT_GRAY);
        
        // add panel to frame
        this.add(drawPanel); 
        
        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args)
    {
        DrawFrame frame = new DrawFrame("Jehtro");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
