package lc4;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.print("N:");
	int n=s.nextInt();
	int i=1;
	while(i<=n) {
		System.out.print("*");
		i++;
	}
	System.out.println();
	int j=1;
	int k=n-2;
	while(j<=k) {
		int m=1;
	while(m<=k){
		System.out.print("*");
		while(m<=k) {
			System.out.print(" ");
			m++;
		}
		System.out.print("*");
		j++;
		System.out.println();
	}	}
	int l=1;
	while(l<=n) {
		System.out.print("*");
		l++;
	}
}
}
