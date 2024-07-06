package lc12;

import java.util.Scanner;

public class range_reverse {
	public static void sum(int arr[],int i,int k) {
		int a=0;
		for(int j=i;j<=k;j++) {
			a=arr[j];
			arr[j]=arr[k];
			arr[k]=a;
			k--;
		}
		for(int j=0;j<arr.length;j++) {
	System.out.print(arr[j]);
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
		System.out.print("enter starting and ending point");
		int i=s.nextInt();
		int k=s.nextInt();
		sum(arr,i,k);
		
	}

}
