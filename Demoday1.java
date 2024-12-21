package Demoday;

public class Demoday1 {

	public static void main(String[] args) {
         int n=89187,rem,z=1,t;
       t=n;
       while(n!=0) {
    	   n=n/10;
    	   z=z*10;
       }
       z=z/10;
       n=t;
       while(n!=0) {
    	   rem=n/z;
    	   n=n%z;
    	   z=z/10;
    	   System.out.println(rem);
    	   
       }
       System.out.println("number--->"+t);

	}

}
