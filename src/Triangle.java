import java.awt.*;

public class Triangle extends Shape{
	private Point pA;
	private Point pB;
	private Point pC;

	public Triangle(Point pA, Point pB, Point pC) {
		super();

		this.pA = pA;
		this.pB = pB;
		this.pC = pC;
	}

	/**
	 * Returns the area of this shape.
	 * Helen's theorem
	 * @return Returns the area of this shape.
	 */
	@Override
	public double getArea() {
		double sideA = distance(pA, pB);
		double sideB = distance(pB, pC);
		double sideC = distance(pA, pC);

		double p = (sideA + sideB + sideC) / 2;
		return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
	}

	/**
	 * Returns the perimeter of this shape.
	 *
	 * @return The perimeter of this shape.
	 */
	@Override
	public double getPerimeter() {
		double sideA = distance(pA, pB);
		double sideB = distance(pB, pC);
		double sideC = distance(pA, pC);
		return sideA + sideB + sideC;
	}


	public Point getA() {
		return pA;
	}

	public Point getB() {
		return pB;
	}

	public Point getC() {
		return pC;
	}

	public void setA(Point pA) {
		this.pA = pA;
	}

	public void setB(Point pB) {
		this.pB = pB;
	}

	public void setC(Point pC) {
		this.pC = pC;
	}

	@Override
	public String toString() {
		return "Triangle [pA=" + pA + ", pB=" + pB + ", pC=" + pC + "]";
	}

}
