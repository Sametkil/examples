package oop.polymorphism;
public class Main {

	public static void main(String[] args) {
		Shape shape = new Shape();
		//shape.drawShape();
		
		Circle circle = new Circle();
		//circle.drawShape();
		
		Rectangle rectangle = new Rectangle();
		//rectangle.drawShape();
		
		Shape shape2= new Circle();
		//Error :System.out.println(circle instanceof Rectangle);
		
		draw(shape);
		//draw(circle);
		draw(rectangle);
		draw(shape2);
	}

	public static void draw(Shape shape) {
		System.out.println(shape instanceof Circle);
		//System.out.println(shape instanceof Shape);
		shape.drawShape();
	}

}
