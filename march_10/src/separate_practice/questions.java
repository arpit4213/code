package separate_practice;

import java.util.Scanner;

public class questions {
	public static int sol(int a[]) {
		int n=a.length;
		int sum=0;
		int i=0;
		while(i<n-2) {
			if(a[i]+a[i+1]+a[i+2]>1){
				sum=sum+1;
			}
			i=i+3;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[3*n];
		int l=0;
		for(int i=0;i<n;i++) {
			for(int e=0;e<3;e++) {
				a[l]=s.nextInt();
				l++;
			}
			//System.out.println();
		}
		/*int k=0;
		for(int i=0;i<n;i++) {
			for(int e=0;e<3;e++) {
				System.out.print(a[k]+" ");
				k++;
			}
			System.out.println();
		}*/
		System.out.print(sol(a));
	}

}
