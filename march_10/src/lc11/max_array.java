package lc11;
import java.util.Scanner;


public class max_array {
public static void max(int arr[]) {
	
	int a=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>a) {
			a=arr[i];
		}
	}
	System.out.print("largest digit is:"+a);
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
	max(arr);
	}
}
