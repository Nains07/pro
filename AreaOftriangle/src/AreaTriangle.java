import java.util.Scanner;

public class AreaTriangle {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius");
		double r=sc.nextInt();
		double area= Math.PI*(r*r);
		System.out.println("Area of triangle is "+area);
		
		double cir=2*Math.PI*r;
		System.out.println("Circumference of triangle is "+cir);
	}
}