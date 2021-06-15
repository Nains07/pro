package pro2;

class employee {
int empid;
String empname;

employee(int id,String name){
	this.empid=id;
	this.empname=name;
}
void info() {
	System.out.println("ID :"+empid+"  Name :"+empname);
}
public static void main(String[] args) {
	employee ob1=new employee(101,"aaa");
	employee ob2=new employee(102,"bbb");
	
	ob1.info();
}
}
