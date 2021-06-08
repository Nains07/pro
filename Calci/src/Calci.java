import java.util.Scanner;

public class Calci {
public static void main(String args[]) {	
char ope;
Double num1,num2,res;
Scanner sc=new Scanner(System.in);
System.out.println("CHOOSE +  -  *  /");
ope=sc.next().charAt(0);

System.out.println("enter num1");
num1=sc.nextDouble();
System.out.println("enter num2");
num2=sc.nextDouble();


switch(ope)
{

case '+':
	res=num1+num2;
	System.out.println(num1+"+"+num2+"="+res);
	break;

case '-':
	res=num1-num2;
	System.out.println(num1+"-"+num2+"="+res);
	break;
	
case '*':
	res=num1*num2;
	System.out.println(num1+"*"+num2+"="+res);
	break;

case '/':
	res=num1/num2;
	System.out.println(num1+"/"+num2+"="+res);
	break;
	
default:
	System.out.println("choose correct operator=");
	break;

}


}
}