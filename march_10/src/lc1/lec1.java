package lc1;
import java.util.*; 
public class lec1 {

	public static void main(String[] args) {
		System.out.println("simple interest");
		Scanner a=new Scanner(System.in);
		System.out.print("Enter the priciple amount:");
		float p=a.nextFloat();
		System.out.print("Enter the rate:");
		float r=a.nextFloat();
		System.out.print("Enter time period:");
		float t=a.nextFloat();
		float S_I=(p*r*t)/100;
		System.out.print("The interest is:" +S_I);
	}

}
