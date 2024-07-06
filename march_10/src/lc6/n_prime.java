package lc6;
import java.util.*;
public class n_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("N:");
		int n=s.nextInt();
		int i;
		int count = 0;
		for(i=2;i<n;i++) {
			if(n%i==0) {
				count++;
			}
			
		}
		if(count==0) {
			System.out.print("The given number "+n+ " is a prime no.");
		}
		else if(n==1) {
			System.out.print("1 is not considered prime");
		}
		else {
			System.out.print("The given number "+n+" is not a prime no.");
		}
	}

}
