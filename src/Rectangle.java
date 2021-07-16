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

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
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


}