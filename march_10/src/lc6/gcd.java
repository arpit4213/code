package lc6;
import java.util.*;
public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("first no:");
		int a=s.nextInt();
		System.out.print("Second no:");
		int b=s.nextInt();
		if(b>a) {
			int c=b;
			b=a;
			a=c;
		}
		//int sum=0;
		while(a%b!=0) {
			      int c=a%b;
			
			      a=b;
			      b=c;
		}
		System.out.println(b);
	}

}
