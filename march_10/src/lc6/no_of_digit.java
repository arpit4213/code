package lc6;
import java.util.*;
public class no_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("N:");
		int n=s.nextInt();
		int i;
		int count = 0;
		while(n>0){
			n=n/10;
			count++;
		}
		System.out.print(count);
	}

}
