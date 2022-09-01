
import java.util.*;


abstract class Shape 
{
	private String color;
	private boolean filled;


	public Shape() 
   {
		this.color = "navy blue";
		this.filled = true;
	}


	public Shape(String color, boolean filled) 
   {
		this.color = color;
		this.filled = filled;
	}


	public abstract double getArea();


	public abstract double getPerimeter();


	public String toString() 
   {
		String filledStr = "filled";
		if (!filled) 
      {
			filledStr = "Not filled";
		}
		return "A Shape with color of " + color + " and " + filledStr;
	}
public String getColor() 
{
		return color;
	}

	public void setColor(String color) 
   {
		this.color = color;
	}
	public boolean isFilled() 
   {
		return filled;
	}
	public void setFilled(boolean filled) 
   {
		this.filled = filled;
	}
}


class Circle extends Shape 
{
	private double radius;


	public Circle() 
   {
		this.radius = 3.14;
	}


	public Circle(double radius) 
   {
		this.radius = radius;
	}


	public Circle(double radius, String color, boolean filled) 
   {
		super(color, filled);
		this.radius = radius;
	}


	@Override
	public double getArea() 
   {
		return Math.PI * radius * radius;
	}


	@Override
	public double getPerimeter() 
   {
		return 2 * Math.PI * radius;
	}

public String toString() 
   {
		return "A Circle with radius= " + radius + ", which is a subclass of " + super.toString();
	}
   
	public double getRadius() 
   {
		return radius;
	}
	public void setRadius(double radius) 
   {
		this.radius = radius;
	}
   }
 final class Rectangle extends Shape 
{
	private double width;
	private double length;


	public Rectangle() 
   {
		this.width = 3.14;
		this.length = 3.14;
	}


	public Rectangle(double width, double length) 
   {
		this.width = width;
		this.length = length;
	}


	public Rectangle(double width, double length, String color, boolean filled) 
   {
		super(color, filled);
		this.width = width;
		this.length = length;
	}


	@Override
	public double getArea() 
   {
		return width * length;
	}


	@Override
	public double getPerimeter() 
   {
		return 2 * (width + length);
	}


	public String toString() 
   {
		return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of "
				+ super.toString();
	}
	public double getWidth() 
   {
		return width;
	}
	public void setWidth(double width) 
   {
		this.width = width;
	}
	public double getLength() 
   {
		return length;
	}
	public void setLength(double length) 
   {
		this.length = length;
	}


}


class App
 {


	public static void main(String[] args) 
   {
		Shape[] arr = new Shape[4];
		Circle c1 = new Circle(4.65);
		Circle c2 = new Circle(2.5, "navy bule", true);
		c1.setColor("Red");
		c1.setFilled(true);
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(3, 3.5, "navy bule", true);
		r1.setWidth(4.25);
		r1.setLength(3);
		r1.setColor("pink");
		r1.setFilled(true);
		arr[0] = c1;
		arr[1] = c2;
		arr[2] = r1;
		arr[3] = r2;


		for (int i = 0; i < arr.length; i++) 
      {
			System.out.println(arr[i].toString());


		}
	}
   
   }