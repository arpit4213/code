package lc13;

import java.util.Scanner;

public class running_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int arr[]= new int[5];
		System.out.print("Enter the valus:");
		 for(int i=0;i<5;i++) {
			 arr[i]=s.nextInt();
		 }
		 int n=arr.length;
		 int ans[]=new int[n];
		 ans[0]=arr[0];
			 for(int i=1;i<arr.length;i++) {
				 if(arr[i]>ans[i-1]) {
					 ans[i]=arr[i];
				 }
				 else {
					 ans[i]=ans[i-1];
				 }
			 }
		 for(int i=0;i<arr.length;i++) {
	System.out.print(ans[i]+" ");	
		 }
	}

}
