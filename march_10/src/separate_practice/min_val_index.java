package separate_practice;

import java.util.Scanner;
public class min_val_index {
	public static int min(int[]a){
		int min=a[0];
		int k=0;
		for(int i=0;i<a.length;i++) {
			//min=Math.min(min,a[i]);
			if(min>a[i]) {
				min=a[i];
				k=i;
			}
		}
		return k;
	}
	public static int min_range(int[]a,int in,int en) {
		int min=a[0];
		int k=0;
		int q=in;
		int r=en;
		for(int i=q;i<=r;i++) {
			//min=Math.min(min,a[i]);
			if(min>a[i]) {
				min=a[i];
				k=i;
			}
		}
		return k;
	}
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.print("Enter the array length:");
			int n=s.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) {
				System.out.println("Enter the value of "+i+"th index:");
				a[i]=s.nextInt();
			}
			System.out.print("starting index");
			int in=s.nextInt();
			System.out.print("ending index");
			int en=s.nextInt();
			System.out.println(min_range(a,in,en));
			
	}

}
