package lc11;

import java.util.Scanner;

public class reverse_arr {
	public static void sum(int arr[]) {
		int a=0;
		int k=arr.length-1;
		for(int i=0;i<=k;i++) {
			a=arr[i];
			arr[i]=arr[k];
			arr[k]=a;
			k--;
		}
		for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]);
		}
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
			sum(arr);
		
	}

}
