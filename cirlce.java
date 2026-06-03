public class Circle {
	int radius = 7;
	
	public void calculateArea()
	{
		double pi = 3.14;
		double area = pi * radius *radius;
		
		System.out.println("Radius : " + radius);
		System.out.println("Area : "+area);
	}
	

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.calculateArea();

	}

}