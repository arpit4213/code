package lc4;
import java.util.Scanner;
class Q9 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("N:");
    int n=s.nextInt();
    int spc=n;
    int str=1;
    int row=1;
    while(row<=n){
        int a=1;
        while(a<spc){
            System.out.print(" ");
            a++;
        }
        int b=1;
        while(b<=str){
            System.out.print("*");
            b++;
        }
        /*int c=1;
        while(c<row){
            System.out.print("*");
            c++;
        }*/
        System.out.println();
        row++;
        str=str+2;
        spc--;
    }
    }
}