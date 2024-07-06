package lc_idk;

import java.util.Scanner;

public class zigzag_arra {
		// TODO Auto-generated method stub
		public static void display(int a[][]) {
			int m=a.length;
			int n=a[0].length;
			for(int i=0;i<m;i++) {
				if(i%2==0) {
				for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
					}
				}
				else {
					for(int j=n-1;j<=0;j--) {
						System.out.print(a[i][j]+" ");
					}
				}	
				System.out.println();
			
			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			/*System.out.print("Enter no of rows:");
			int m=s.nextInt();
			System.out.print("Enter no of columns:");
			int n=s.nextInt();
			*/int a[][]= {
					{1,2,3},
					{8,7,6},
					{3,2,1}
			};
			/*for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
				a[i][j]=s.nextInt();
				}
			}*/
			display(a);
	}

}
