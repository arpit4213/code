package lc11;

import java.util.Scanner;

public class array_sum {
	public static int sum(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		//System.out.print("Sum of elements of sum :"+sum);
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int j=0;j<n;j++) {
			System.out.print("Enter the index no."+j+":");
			arr[j]=s.nextInt();
		}
		int a=sum(arr);
		System.out.print("Sum of elements of sum :"+a);
	}

}
