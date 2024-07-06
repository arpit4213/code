package separate_practice;

import java.util.Scanner;

public class ins_sort {
	public static void sort(int arr[],int i, int temp) {
		int n=arr.length;
	while(i>=0 && arr[i]>temp) {
		arr[i+1]=arr[i];
		i--;
	}
	arr[i+1]=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//System.out.print("Enter the array length:");
			int n=s.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			}
			for(int i=0;i<n;i++) {
			sort(arr,i,arr[i+1]);
			}
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
	}

}
