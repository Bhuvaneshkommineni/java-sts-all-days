package Addno;

import java.util.Scanner;

public class AddNo {

	public static void main(String[] args) {
     
		Scanner sc=new Scanner(System.in);
		int n,l,index=0,p=1,res=0,c=0;
		
	System.out.println("enter the number");
	n=sc.nextInt();
	while(n!=0) {
		l=n%10;
		n=n/10;
		index++;
		l=l+c;
		if(index==3) {
			l=l+7;
			
		}
		if(l>=10) {
			c=l/10;
		    l=l%10;
		}
		res=res+1*p;
		p=p*10;
		System.out.println("c--->"+c);
		if(c==1) {
			res=c*p+res;
		}
		System.out.println(res);
	}
		
	}

}
