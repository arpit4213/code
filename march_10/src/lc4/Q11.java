package lc4;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    System.out.print("N:");
	    int n=s.nextInt();
	    int spc=n;
	    int str=1;
	    int row=1;
	    while(row<=n){
	        int a=1;
	        while(a<spc){
	            System.out.print("  ");
	            a++;
	        }
	        int b=1;
	        while(b<=str){
	        	if(b%2==1) {
	            System.out.print("* ");
	        	}
	        	else {
	            System.out.print("  ");
	        }
	        	b++;}
	        System.out.println();
	        row++;
	        str=str+2;
	        spc--;
	    }
	}

}
