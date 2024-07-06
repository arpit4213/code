package lc_idk;
import java.util.*;
public class array_2d {
	public static void display(int a[][]) {
		int m=a.length;
		int n=a[0].length;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no of rows:");
		int m=s.nextInt();
		System.out.print("Enter no of columns:");
		int n=s.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
			a[i][j]=s.nextInt();
			}
		}
		display(a);
	}

}
