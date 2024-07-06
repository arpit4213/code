package lc4;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("n:");
		int n=s.nextInt();
		int row=1;
		int spc=0;
		int j=n;
		while(row<=n){
			int a=1;
			while(a<=spc) {
				System.out.print(" ");
				a=a+1;
			}
			int k=1;
			while(k<=j) {
				System.out.print("*");
				k=k+1;
			}
			System.out.println();
			row=row+1;
			j=j-1;
			spc=spc+2;
		}
		int d=n;
		  while(d<2*n-1) {
		    	int b=1;
		    while(b<=spc-4) {
		    	System.out.print(" ");
		    	b++;
		    }
		    int c=1;
		    while(c<=j+2) {
		    	System.out.print("*");
		    	c++;
		    }
		    System.out.println();
		    d++;
		    spc=spc-2;
		    j++;
	}

}
}
