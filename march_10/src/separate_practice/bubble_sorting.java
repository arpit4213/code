package separate_practice;

import java.util.Scanner;

public class bubble_sorting {
	public static int[] bubble_sort(int[] a) {
		int n=a.length;
		for(int i=n-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(a[j]>a[j+1]) {
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		return a;
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
		System.out.println("before sorting");
		System.out.print("[");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+",");
		}
		System.out.println("]");
		bubble_sort(a);
		System.out.println("after sorting");
		System.out.print("[");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+",");
		}
		System.out.print("]");
	}

}
