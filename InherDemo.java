package Ex;



public class InherDemo {
	public static void main(String[] args) {
		Employee p=new Attender();
		Engineer eng=new Engineer();
		int k=eng.met();
		System.out.println(k);
		
	}
}
class Employee{
	int q=7;
	
		
	
	
	void add() {
		System.out.println("Hllo");
		
	}
	
}
//inheritance or generalization
//child is a kind of parent,... child can replace parent
class Engineer extends Employee{
	
	public int met() {
		int c =q+7;
		add();
		return c;
	}
	
}
class Attender extends Employee{
	
}
