package separate_practice;

import java.util.Scanner;
public class product_arr_exce_self {
	public static void sol(int a[]) {
		int n=a.length;
		if(n==1) {
			System.out.print("0");
			return;
		}
		long left[]=new long[n];
		long right[]=new long[n];
		left[0]=1;
		right[n-1]=1;
		long ans[]=new long[n];
		for(int i=1;i<n;i++) {
			left[i]=left[i-1]*a[i-1];
		}
		for(int i=n-2;i>=0;i--) {
			right[i]=right[i+1]*a[i+1];
		}
		for(int i=0;i<n;i++) {
			ans[i]=left[i]*right[i];
		}
		for(int i=0;i<n;i++){
			System.out.print(ans[i]+" ");
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
		
	}

}
