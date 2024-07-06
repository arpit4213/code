package lc10;
import java.util.*;

public class array {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int arr[]=new int[5];
	int k=1;
	
	for(int i=0;i<5;i++) {
		System.out.print("Enter the "+k+" value:");
		arr[i]=s.nextInt();
		System.out.println("value of "+k+" index:"+arr[i]);
		k++;
	}

	}

}
