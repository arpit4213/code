package lc6;
import java.util.*;
public class even_odd_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("N:");
		int n=s.nextInt();
		int osum=0;
		int esum=0;
		int count = 0;
		while(n>0){
			int a=n%10;
			if(a%2==0) {
				esum=esum+a;
			}
			else {
				osum=osum+a;
			}
			n=n/10;
			
		}
		System.out.println("value of odd digit sum="+osum);
		System.out.print("value of even digit sum="+esum);
	}

}
