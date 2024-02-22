abstract class TwoDShape{
	private double width;
	private double height;
	private String name;
	
	public TwoDShape(double w,double h,String n) {
		width = w;
		height = h;
		name = n;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public String getName() {
		return name;
	}
	
	abstract double area();//추상메서드(내용없는 메서드)
}

class Triangle extends TwoDShape{
	public Triangle(double w,double h) {
		super(w,h,"triangle");
	}
	
	double area() {
		return getWidth()*getHeight()/2;
	}
	
}

class Rectangle extends TwoDShape{
	public Rectangle(double w,double h) {
		super(w,h,"rectangle");
	}
	
	double area() {
		return getWidth()*getHeight();
	}
}

public class OverrideTest {
	public static void main(String[] args) {
		// TODO 부모-자식의 참조관계, 오버라이딩
		
		TwoDShape shapes[] = new TwoDShape[5];
		shapes[0] = new Triangle(8.0,12.0);
		shapes[1] = new Rectangle(20.0,10.0);
		shapes[2] = new Rectangle(10.0,4.0);
		shapes[3] = new Triangle(7.0,10.0);
		//shapes[4] = new TwoDShape(1.0,1.0,"일반");
		
		for(int i=0;i<shapes.length-1;i++) {
			System.out.println("이름: "+shapes[i].getName());
			System.out.println("면적: "+shapes[i].area());
			System.out.println("------------------------------- ");
			}
		}
	}

