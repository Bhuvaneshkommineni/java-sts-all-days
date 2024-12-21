package Day4;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	System.out.println("enter two names");
	String name1=sc.next();
	String name2=sc.next();
	System.out.println("Before swapping");
	System.out.println("name1---->"+name1);
	System.out.println("name2---->"+name2);
	name1=name1+name2;
	name2=name1.substring(0,name1.length()-name2.length());
	name1=name1.substring(name2.length());
	
	System.out.println("After swapping");
	System.out.println("name1----->"+name1);
	System.out.println("name2----->"+name2);
	}

}
