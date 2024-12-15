import java.awt.Color;

/**
 * Illustrates some aspects of drawing with StdDraw.
 */
public class StdShowDemo {
	
	public static void main (String[] args) {	
	    int canvasWidth = Integer.parseInt(args[0]);
	    int canvasHeight = Integer.parseInt(args[1]);
		drawSquares(canvasWidth, canvasHeight);
	}

	/**
	 * This function illustrates how the drawing of shapes with StdDraw functions is 
	 * "automatically" adjusted to the specified size of the canvas. The function gets
	 * the canvas dimensions, and then goes on to draw three filled squares, colored red,
	 * green, and blue.
	 * By calling this function with different canvas sizes, we demonstrate that the drawing
	 * is always scaled correctly, irrespective of canvas size. 
	 * @param w - the given canvas width
	 * @param h - the given canvas height of the physical window
	 */
	public static void drawSquares(int w, int h) {
		// Sets the width and height of the canvas.
		// The unit of measuermenet is the real pixels of the host screen device.
		StdDraw.setCanvasSize(w, h);
		// Specifies that irrespective of the canvas size, the logical window size
		// (in this program) is 500 by 500 pixels.
        StdDraw.setXscale(0, 499);
        StdDraw.setYscale(0, 499);
        // In all the subsquent drawing commands, the coordinates and the sizes
        // of the drawn shapes are always treated with reference to the 500 by 500
        // size of the logical window. For example, if the physical window is 
        // a square (w == h), the size of each square drawn below will always 
        // be 1/5 of the size of the physical window.
		StdDraw.setPenColor(Color.red);
		// Draws a filled square, centered at 50,50, with a "radius" of 50.
		// The "radius" is half of the square size. 
    	StdDraw.filledSquare(50, 50, 50);
    	StdDraw.setPenColor(Color.green);
    	StdDraw.filledSquare(150, 150, 50);
    	StdDraw.setPenColor(Color.blue);
    	StdDraw.filledSquare(250, 250, 50);
		StdDraw.show();
	}
}

