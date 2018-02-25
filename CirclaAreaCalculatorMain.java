
public class CirclaAreaCalculatorMain {
	static int radious;
	static double area;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		radious = 3;
		area = 2*Math.PI*Math.pow(radious, 2);
		System.out.println("The area of a circle with radious "+radious+" is: "+area);
		System.out.println("The half area of a circle with radious "+radious+" is: "+area/2);
	}

}
