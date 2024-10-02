Q2

package AbstractPack;

public abstract class GeometricShape {
	  abstract public double area(); 
		    abstract public double perimeter(); 
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
		    private double side1;
		    private double side2;
		    private double side3;
            
		

		    public Triangle(double base, double height, double side1, double side2) {
				this.base = base;
				this.height = height;
				this.side1 = side1;
				this.side2 = side2;
				this.side3 = side3;
			}

			public double area() {
		        return 0.5 * base * height; 
		    }

		    public double perimeter() {
		       
		        return side1+side2+side3;
		    }
		

		
		    public static void main(String[] args) {
		        GeometricShape circle = new Circle(5);
		        System.out.println("Circle: ");
		        System.out.println("Area: " + circle.area());
		        System.out.println("Perimeter: " + circle.perimeter());

		        GeometricShape rectangle = new Rectangle(4, 6);
		        System.out.println("\nRectangle: ");
		        System.out.println("Area: " + rectangle.area());
		        System.out.println("Perimeter: " + rectangle.perimeter());

		        GeometricShape triangle = new Triangle(3,4,5,7);
		        System.out.println("\nTriangle: ");
		        System.out.println("Area: " + triangle.area());
		        System.out.println("Perimeter: " + triangle.perimeter());
		    }
		} 
