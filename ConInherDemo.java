package Ex;

class ConInherDemo {
	public static void main(String[] args) {
		Shoe shoe=new LeatherShoe(100);
		
	}

}

class Shoe{
	int i=100;
	
	public Shoe() {
		System.out.println("cons of shoe called....");
	}
	public Shoe(int i) {
		System.out.println("parametric constructor of shoe called....");
	}
	public void met() {
		System.out.println("parent shoe class method called...");
	}

}
class LeatherShoe extends Shoe{
	//there is no concept of over riding in constructor
	//always the parent class default constructor is called...
	
	public LeatherShoe(int i) {
		super(343);//super class constructor - should be the first line in the constructor
		System.out.println(super.i);//super can refer to super class variable
		super.met();//super can refer to super class method
		System.out.println("cons of leather shoe called....");
		new Shoe();
		new Shoe();
		new Shoe();
		new Shoe();
	}
}