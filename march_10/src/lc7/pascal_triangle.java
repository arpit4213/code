package lc7;
import java.util.*;
public class pascal_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("N:");
		int n=s.nextInt();
		int sumr=1;
		int suma=1;
		int row=0;
		while(row<n) {
			sumr=1;
			if(row==0) {
				sumr=1;
			}
			else {
			for(int j=1;j<=row;j++) {
				sumr=sumr*j;
			}
			}
			int i=0;
			while(i<=row) {
			int sumn=1;	
				if(i==0) {
					sumn=1;
				}
				else {
			for(int k=1;k<=i;k++) {
				sumn=sumn*k;
			}
			}
			int a=row-i;
			suma=1;
			if(a==0) {
				suma=1;
			}
			else {
			for(int l=1;l<=a;l++) {
				suma=suma*l;
			}
			}
			int coff=sumr/(sumn*suma);
			System.out.print(coff+" ");
			i++;
			}
			System.out.println();
			row++;
		}
	}

}
