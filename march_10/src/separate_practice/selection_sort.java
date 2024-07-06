package separate_practice;
import java.util.*;
public class selection_sort {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the array length:");
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		System.out.println("Enter the value of "+i+"th index:");
		a[i]=s.nextInt();
	}
	System.out.println("before sorting");
	System.out.print("[");
	for(int i=0;i<n;i++) {
		System.out.print(a[i]+",");
	}
	System.out.print("]");
	selection_sort(a);
	System.out.println("after sorting");
	System.out.print("[");
	for(int i=0;i<n;i++) {
		System.out.print(a[i]+",");
	}
	System.out.print("]");
}

public static int[] selection_sort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			//int min=a[i];
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[i]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		return a;
	}
}
