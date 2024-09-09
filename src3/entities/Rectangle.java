package entities;

public class Rectangle {
	public Double width, height;

	public Double area() {
		return width * height;
	}

	public Double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

	public Double perimeter() {
		return (width * 2) + (height * 2);
	}
}
