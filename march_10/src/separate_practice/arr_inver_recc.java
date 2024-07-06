package separate_practice;

import java.util.Scanner;

public class arr_inver_recc {
	public static void fun(int a[],int n) {
		if(n==0) {
			return;
		}
		fun(a,n-1);
		int x=n;
		n=a[n];
		a[n]=x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		fun(a,n-1);
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
