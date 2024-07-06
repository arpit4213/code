package lc6;
import java.util.*;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("N:");
		int n=s.nextInt();
		int count = 0;
		while(n>0){
			int a=n%10;
			count=count*10+a;
			n=n/10;
		}
		
		System.out.println(count);
	}

}
