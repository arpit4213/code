package june30;

import java.util.Scanner;

public class power_recurssion {
	public static int mypower(int a,int b) {
		if(b==0) {
			return 1;
		}
		int ans1=mypower(a,b-1);
		int ans=a*ans1;
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(mypower(a,b));
	}

}
