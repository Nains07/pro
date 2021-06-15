package pro6;

class Bird {
int age;
String name;

Bird(){
	System.out.println("Parrot");
}
Bird(int x, String y){
	age=x;
	name=y;
	System.out.println("Bird Name :"+y +"  Bird Age "+x);
	
}
Bird(String z){
	name=z;
	System.out.println("Bird name"+z);
	
}
public static void main(String[] args) {
	Bird b=new Bird();
	new Bird(23,"MM");
}
}
