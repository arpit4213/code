package lc4;
import java.util.*;
public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("N:");
		int n=s.nextInt();
		int row=1;
		int a=n-3;
		int l1=n-2;
		int b=1;
		while(row<=n) {
		int i=1;
		while(i<a) {
			System.out.print("  ");
			i++;
		}
		int j=1;
		while(j<=b) {
			System.out.print("* ");
			j++;
		}
		System.out.println();
		row++;
		if(row<l1) {
		a--;
		b=b+2;
		}
		else {
			a++;
			b=b-2;
		}
		}
		/*a=1;
		int c=l1;
		while(l1<=n) {
			int i=1;
			while(i<=a) {
				System.out.print(" ");
				i++;
			}
			int j=1;
			while(j<=c) {
				System.out.print("*");
				j++;
			}
			/*int k=1;
			while(k<=a) {
				System.out.print("  ");
				k++;
			}
			System.out.println();
			l1++;
			a++;
			c=c-2;
		}*/
		
	}

}
