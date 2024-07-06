package seperate_practice;

import java.util.Scanner;

public class running_sum {
	public static void sol(int a[]) {
		int sum=0;
		int n=a.length;
		for(int i=0;i<n;i++) {
			sum=sum+a[i];
			a[i]=sum;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		sol(a);
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
