package lc4;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		    System.out.print("N");
		    int n=s.nextInt();
		    int spc=n;
		    int str=1;
		    int row=1;
		    int d=n;
		    
		    while(row<2*n){
		    	int b=1;
		        while(b<spc){
		            System.out.print(" ");
		            b++;
		        }
		            int c=1;
				    while(c<=str) {
				    	System.out.print("*");
				    	c++;
				    }
				    System.out.println();
		        row++;
		        if(row<=n) {   
		        str++;
		        spc--;
		    }
		        else {
		        	spc++;
		        	str--;
		        }
		    }
		    /*str=1;
		    spc=n;
		    while(d<2*n) {
		    	int b=1;
		    while(b<=str) {
		    	System.out.print(" ");
		    	b++;
		    }
		    int c=1;
		    while(c<spc) {
		    	System.out.print("*");
		    	c++;
		    }
		    System.out.println();
		    d++;
		    spc--;
		    str++;
		    }*/
	}

}
