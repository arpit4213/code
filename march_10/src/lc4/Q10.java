package lc4;
import java.util.Scanner;
class Q10 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("N:");
    int n=s.nextInt();
    int spc=2*n;
    int str=1;
    int row=1;
    while(row<=n){
        int a=1;
        while(a<spc){
            System.out.print("*");
            a++;
        }
        System.out.println();
        int b=1;
        while(b<=str){
            System.out.print(" ");
            b++;
        }
        row++;
        str++;
        spc=spc-2;
    }
    }
}