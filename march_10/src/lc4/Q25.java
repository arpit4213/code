package lc4;

import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("n:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int row=1;
		int str=1;
		int spc=n;
		while(row<=n) {
			int i=1;
			while(i<spc) {
				System.out.print(""+"\t");
				i=i+1;
			}
			int j=1;
			int a=1;
			while(j<=str) {
				System.out.print(a+"\t");
				j++;
				if(j<=(str+1)/2) {
					a++;
				}else {
				a--;
				}
			}
			System.out.println();
			row=row+1;
			spc--;
			str=str+2;
		}

	}

}
