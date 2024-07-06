package separate_practice;

import java.util.Scanner;

public class nobita {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
		 int a=s.nextInt();
		 int b=s.nextInt();
		 int c=a%b;
		 if(c<=b/2) {
			 System.out.print(c);
		 }
		 else {
			 System.out.print(b%c);
		 }
		}
	}
}
