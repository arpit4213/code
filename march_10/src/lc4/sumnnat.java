package lc4;
import java.util.*;
public class sumnnat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	System.out.print("n:");
	int n=s.nextInt();
	int i=1;
	int a=1;
	while(i<n) {
		i=i+1;
		a=a*i;
	}
	System.out.print(a);
	}

}
