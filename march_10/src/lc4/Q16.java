package lc4;

import java.util.Scanner;

public class Q16 {
	public static void main(String [] args) {
	Scanner s=new Scanner(System.in);
	System.out.print("n:");
	int n=s.nextInt();
	int row=1;
	int spc=1;
	int j=n;
	while(row<=n){
		int a=1;
		while(a<j) {
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
	}
	int d=n;
	j=1;
	  while(d<2*n-1) {
	    	int b=1;
	    while(b<=j) {
	    	System.out.print(" ");
	    	b++;
	    }
	    int c=0;
	    while(c<=spc) {
	    	System.out.print("*");
	    	c++;
	    }
	    System.out.println();
	    d++;
	    spc++;
	    j++;
}

}}
