package pro3;

class cs {
int p,q;

public cs() {
	System.out.println("Hello");
	
}
public cs(int i,int j) {
	p=i;
	q=j;
}
public int add(int i,int j,int k) {
	
	return (i+j+k);
}
public int add(int i,int j) {
	
	return (i+j);
}

public void printData() {
	System.out.println("P = "+p);
	System.out.println("Q ="+q);
}
}
class ConsOverloading{
	
	public static void main(String[] args) {
		int x=2,y=3,z=4;
		cs c=new cs();
		cs c1=new cs(5,6);
		c1.printData();
		int m=c.add(x,y);
		System.out.println(m);
		int n=c.add(x, y,z);
		System.out.println(n);
	}
}
