package lc11;

import java.util.Scanner;

public class array_rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("N:");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.print("K:");
		int k=s.nextInt();
		System.out.print("Enter the array elemnts:");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=n;i<0;i--) {
			int j=arr[i-1];
			arr[i-1]=arr[i-2];
			arr[0]=j;
		}
	}

}
