package lc1;
import java.util.*;
public class big_3_no {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.print("Enter the 1st no:");
	int a=s.nextInt();
	System.out.print("Enter the 2nd no:");
	int b=s.nextInt();
	System.out.print("Enter the 3rd no:");
	int c=s.nextInt();
	if(a>b && a>c ) {
		System.out.print(a+"is max");
	}
	else if(b>a&&b>c) {
		System.out.print(b+" is greater");
	}
	else {
		System.out.print(c+" is greater");
	}
}

}
