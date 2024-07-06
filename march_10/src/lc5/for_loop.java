package lc5;

import java.util.Scanner;

public class for_loop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("n:");
		int n=s.nextInt();
		int i;
		int sum=0;
		for(i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.print("The summ is:"+sum);
	}

}
