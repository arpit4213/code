package lc10;
import java.util.*;

public class arr_user_size {
	public static void print(int arr[]) {
		//System.out.print(arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter the value on index "+i+":");
			arr[i]=s.nextInt();
		}
		print(arr);
	}

}
