package lc4;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			while(k<=spc) {
				System.out.print("*");
				k=k+1;
			}
			System.out.println();
			row=row+1;
			j=j-1;
			spc=spc+1;
		}
	}

}