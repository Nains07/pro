package Lab2;

public class hi {
	String name,city;
	int age;
	static int m;
	void printData() {
		
		System.out.println("Name :"+name);
		System.out.println("Name :"+city);
		System.out.println("Name :"+age);
	
}

	
}
class set{
	public static void main(String[] args) {
		hi s1=new hi();
		hi s2 =new hi();
		
		s1.name="ram";
		s1.city="chennai";
		s1.age=20;
		
		s1.printData();
		
	}
}

