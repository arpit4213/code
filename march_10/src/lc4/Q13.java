package lc4;
import java.util.*;
class Q13{
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
        while(b<str){
            System.out.print("*");
            b++;
        }
        System.out.println();
        if(row<n) {
        	str++;
        }
        else {
        	str--;
        }
        row++;
    }
    /*while(d<2*n) {
    int c=1;
    while(c<spc) {
    	System.out.print("*");
    	c++;
    }
    System.out.println();
    spc--;
    d++;
    }*/
    }
}