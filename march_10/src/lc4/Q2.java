package lc4;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("n:");
		int n=s.nextInt();
		int row=1;
		int nst=1;
		while(row<=n) {
			int i=1;
			while(i<=nst) {
				System.out.print("* ");
				i=i+1;
			}
			System.out.println();
			row=row+1;
			nst=nst+1;
		}
	}

}
