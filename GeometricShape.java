package AbstractPack;

public abstract class GeometricShape {
	   abstract public double area(); // Changed return type to double
	    abstract public double perimeter(); // Changed return type to double
	}

	// Circle class
	class Circle extends GeometricShape {
	    private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    public double area() {
	        return Math.PI * radius * radius;
	    }

	    public double perimeter() {
	        return 2 * Math.PI * radius; 
	    }
	}

	// Rectangle class
	class Rectangle extends GeometricShape {
	    private double width;
	    private double height;

	    public Rectangle(double width, double height) {
	        this.width = width;
	        this.height = height;
	    }

	    public double area() {
	        return width * height; 
	    }

	    public double perimeter() {
	        return 2 * (width + height); 
	    }
	}

	// Triangle class
	class Triangle extends GeometricShape {
	    private double base;
	    private double height;

	    public Triangle(double base, double height) {
	        this.base = base;
	        this.height = height;
	    }

	    public double area() {
	        return 0.5 * base * height; 
	    }

	    public double perimeter() {
	       
	        return 3 * base; 
	    }
	}

	// Main class to test the shapes
	public class Main {
	    public static void main(String[] args) {
	        GeometricShape circle = new Circle(5);
	        System.out.println("Circle: ");
	        System.out.println("Area: " + circle.area());
	        System.out.println("Perimeter: " + circle.perimeter());

	        GeometricShape rectangle = new Rectangle(4, 6);
	        System.out.println("\nRectangle: ");
	        System.out.println("Area: " + rectangle.area());
	        System.out.println("Perimeter: " + rectangle.perimeter());

	        GeometricShape triangle = new Triangle(3, 4);
	        System.out.println("\nTriangle: ");
	        System.out.println("Area: " + triangle.area());
	        System.out.println("Perimeter: " + triangle.perimeter());
	    }
	}