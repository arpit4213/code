package lc13;

import java.util.Scanner;

public class sub_array {
	public static void subarray(int[] arr) {
		for(int s=0;s<arr.length;s++) {
			for(int e=s;e<arr.length;e++) {
				//System.out.println(s+" "+e);
			for(int k=s;k<=e;k++) {
				//System.out.print("{");
				System.out.print("("+arr[k]+")");
				//System.out.print("}");
			}
			System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		System.out.print("n");
		int n=a.nextInt();
		int arr[]=new int[n];
		System.out.print("enter values");
		for(int i=0;i<n;i++) {
			arr[i]=a.nextInt();
		}
		subarray(arr);
		
	}

}
