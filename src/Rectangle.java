// Below code is taken from great lectures of Prof. Franck van Breugel:

import java.io.PrintStream;
import java.util.*;

/**
 A class for representing a rectangle.
 This class contains no static attributes and no static methods.
 */
public class Rectangle extends Shape {
    private int width;
    private int height;

    /**
     * Creates a rectangle with the given width and height.
     *
     * @param width  the width of the rectangle.
     * @param height the height of the rectangle.
     * @pre. width >= 0
     * @pre. height >= 0
     */
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Creates a rectangle with zero width and height.
     */
    public Rectangle() {
        this(0, 0);
    }


    /**
     * Creates a rectangle with the same width and height as the given rectangle.
     *
     * @param rectangle the rectangle to be copied.
     */
    public Rectangle(Rectangle rectangle) {
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    /**
     * Sets the width of this rectangle to the given width.
     *
     * @param width The new width of this rectangle.
     * @pre. width >= 0
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Sets the height of this rectangle to the given height.
     *
     * @param height The new height of this rectangle.
     * @pre. height >= 0
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Returns the width of this rectangle.
     *
     * @return The width of this rectangle.
     */
    public int getWidth() {
        return this.width;
    }

    /**
     * Returns the height of this rectangle.
     *
     * @return The height of this rectangle.
     */
    public int getHeight() {
        return this.height;
    }

    /**
     * Returns the area of this rectangle.
     *
     * @return The area of this rectangle.
     */
    public double getArea() {
        return this.width * this.height;
    }

    /**
     * Returns the perimeter of this rectangle.
     *
     * @return The perimeter of this rectangle.
     */
    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    /**
     * Returns a string representation of this rectangle.
     * For example, the string representation of new Rectangle(1, 2)
     * is "Rectangle of width 1 and height 2".
     *
     * @return A string representation of this rectangle.
     */
    public String toString() {
        return "Rectangle of width " + this.width + " and height " + this.height;
    }

    /**
     * Tests if this rectangle is the same as the given object.
     * Two rectangles are considered the same if they have the
     * same width and height.  A rectangle is not equal to null.
     * It is also not equal to any object that is not a rectangle.
     *
     * @param object An object.
     * @return true if this and the other object are the same,
     * false otherwise.
     */
    public boolean equals(Object object) {
        if (object == null) return false;
        if (this.getClass().equals(object.getClass())) {
            Rectangle other = (Rectangle) object;
            return this.width == other.width && this.height == other.height;
        }
        return false;
    }

    /**
     * Scales this rectangle with the given factor.
     *
     * @param factor Scaling factor.
     * @pre. factor >= 0
     */
    public void scale(int factor) {
        this.width = this.width * factor;
        this.height = this.height * factor;
    }


    /**
     * Creates an empty rectangle and prints it, prompts
     * for the width and height of a rectangle, creates it,
     * and prints it.
     * Rectangle.exampleRunme();
     */
    public static void exampleRunme() {
        Scanner input = new Scanner(System.in);
        PrintStream out = System.out;

        Rectangle emptyRectangle = new Rectangle();
        out.println(emptyRectangle);

        int width;
        int height;

        //get the width and height
        do {
            out.print("Enter width [a non-negatve int]: ");
            width = input.nextInt();
        }
        while (width < 0);

        do {
            out.print("Enter height [a non-negatve int]: ");
            height = input.nextInt();
        }
        while (height < 0);

        Rectangle r = new Rectangle(width, height);
        out.println(r);

        //get a new width for our rectangle
        do {
            out.print("Enter new width [a non-negatve int]: ");
            width = input.nextInt();
        }
        while (width < 0);

        r.setWidth(width);
        out.println(r);
    }

    /**
     * Creates a list of random rectangles, prints it, sorts it and prints it again.
     * Rectangle.exampleSort();
     */
    public static void exampleSort() {
        PrintStream out = System.out;

        final int MAX_WIDTH = 10;
        final int MAX_HEIGHT = 10;
        final int MAX_SIZE = 10;

        List<Rectangle> list = new LinkedList<Rectangle>();
        Random random = new Random();
        int size = random.nextInt(MAX_SIZE + 1);
        for (int i = 0; i < size; i++) {
            list.add(new Rectangle(
                    random.nextInt(MAX_WIDTH + 1),
                    random.nextInt(MAX_HEIGHT + 1)
            ));
        }
        out.println(list);
        Collections.sort(list);
        out.println(list);
    }

}