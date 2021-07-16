import java.awt.*;

public abstract class Shape implements Comparable<Shape>{
    protected String uuid;

    public Shape() {
        this.uuid = UUIDFactory.getInstance().generate().toString();
    }

    public String getUuid() {
        return uuid;
    }

    /**
     * compare by uuid
     * @param r shape
     * @return
     */
    public int compareTo(Shape r) {
        return getUuid().compareTo(r.getUuid());
    }


    /**
     * Returns the area of this shape.
     *
     * @return The area of this shape.
     */
    public abstract double getArea();

    /**
     * Returns the perimeter of this shape.
     *
     * @return The perimeter of this shape.
     */
    public abstract double getPerimeter();

    protected double distance(Point a, Point b) {
        return Math.sqrt((a.x - b.x) * (a.x - b.x) + ((a.y - b.y) * (a.y - b.y)));
    }

}
