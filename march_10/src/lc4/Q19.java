package lc4;
import java.util.*;
public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("N:");
		int n=s.nextInt();
		int row=1;
		int spc=-1;
		int str=(n+1)/2;
		while(row<=n) {
			if(spc==-1) {
				int i=1;
				while(i<=n) {
					System.out.print("* ");
					i++;
				}
			}
			else {
				int i=1;
				while(i<=str) {
					System.out.print("* ");
				i++;
				}
				int j=1;
				while(j<=spc) {
					System.out.print("  ");
				j++;
				}
				int k=1;
				while(k<=str) {
					System.out.print("* ");
				k++;
				}
			}
			System.out.println();
			if(row<(n+1)/2) {
				spc=spc+2;
				str--;
			}
			else {
			spc=spc-2;
			str++;
		}
			row++;
		}
	}}
