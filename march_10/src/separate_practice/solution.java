package separate_practice;
import java.util.*;
public class solution {
	public static void sol(int[]  arr) {
	int n=arr.length;
	int a=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				a++;
			}
		}
		for(int i=0;i<a;i++) {
			arr[i]=0;
		}
		for(int i=a;i<n;i++) {
			arr[i]=1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	//	System.out.print("Enter the array length:");
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
		arr[i]=s.nextInt();
		}
		sol(arr);
		for(int i=0;i<n;i++) {
			//arr[i]=s.nextInt();
		System.out.print(arr[i]+" "); 	
		}
		}
	}
