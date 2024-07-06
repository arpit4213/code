package separate_practice;

import java.util.Scanner;

public class min_subarray_sum {
public static int min_sub(int[] a) {
	int csum=0;
	int msum=a[0];
		for(int i=0;i<a.length;i++) {
			csum+=a[i];
			msum=Math.min(msum,csum);
			if(csum>0) {
				csum=0;
			}
		}
		return msum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the array length:");
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the value of "+i+"th index:");
			a[i]=s.nextInt();
		}
		
		System.out.print(min_sub(a));
	}

}
