package separate_practice;

import java.util.Scanner;

public class rPrint {
	public static void fun(int n) {
	if(n==0) {
		return ;
	}
	fun(n-1);
	System.out.println(n);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		fun(n);
	}

}
