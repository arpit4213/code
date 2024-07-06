package lc11;
import java.util.Scanner;


public class sum_min_max_array {
public static int[] all (int arr[]) {
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];
	}
	int min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	int max=arr[0];
	for(int j=0;j<arr.length;j++) {
		if(arr[j]>max) {
			max=arr[j];
		}
	}
	int every[]=new int[3];
	every[0]=sum;
	every[1]=min;
	every[2]=max;
	return every;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
	
	System.out.print("Enter the size for array:");
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		System.out.print("Enter the index no."+i+":");
		arr[i]=s.nextInt();
	}
	int ans[]=all(arr);
	System.out.print("sum="+ans[0]+" min="+ans[1]+" max="+ans[2]);
	}
}
