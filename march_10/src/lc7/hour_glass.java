package lc7;

import java.util.Scanner;

public class hour_glass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        int row=1;
	        int k=n;
	        int n1=n;
	        int spc=2*n;
	        int a=(2*n)+1;
	        int b=1;
	        while(row<=a){
	            int i=1;
	            k=n;
	            int e=k;
	            while(i<=b){
	                System.out.print(k+" ");
	                e=k;
	                k--; 
	                i++;
	            }
	            int j=1;
	            while(j<spc){
	                System.out.print("  ");
	                j++;
	            }
	            int d=1;
	            if(row==n+1) {
	            	e++;
	            	d=2;
	            }
	            while(d<=b) {
	            	System.out.print(e+" ");
	            	e++;
	            	d++;
	            }
	            System.out.println();
	            if(row<=n){
	                spc=spc-2;
	                n1--;
	                b++;
	            }
	            else{
	                spc=spc+2;
	                
	                b--;
	            }
	            k=n1;
	            row++;
	        }
	}

}
