package lc4;

import java.util.*;

public class Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("n:");
		int n=s.nextInt();
		int row=1;
		int str=1;
		int spc=n;
		while(row<=n) {
			int i=1;
			while(i<spc) {
				System.out.print("  ");
				i=i+1;
			}
			int j=1;
			while(j<=str) {
				System.out.print("1 ");
				j++;
			}
			System.out.println();
			row=row+1;
			spc--;
			str=str+2;
		}
	}

}
