package lc4;
import java.util.*;
public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("n:");
		int n=s.nextInt();
		int row=1;
		int str=1;
		int spc=(2*n)-3;
		while(row<=n) {
			int i=1;
			while(i<=str) {
				System.out.print("* ");
				i++;
			}
			int j=1;
			while(j<=spc) {
				System.out.print("  ");
			j++;
			}
			int k=1;
			if(row==n) {
				k=2;
			}
			while(k<=str) {
				System.out.print("* ");
			k++;
			}
				System.out.println();
				row++;
				str++;
				spc=spc-2;
		}
	}

}
