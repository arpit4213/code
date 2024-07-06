package lc9;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int row=1;
        int spc=n;
        while(row<=n){
            int i=1;
            while(i<spc){
                System.out.print(" ");
                i++;
            }
            if(row==1||row==n){
                int j=1;
                while(j<=n){
                    System.out.print("*");
                    j++;
                }
            }
                else{
                    int k=1;
                    while(k<=n){
                        if(k==1||k==n){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                        k++;
                    }
                }
            
            System.out.println();
            spc--;
            row++;
        }}
    }
