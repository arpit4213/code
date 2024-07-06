package separate_practice;
import java.util.*;
public class rainwatter {
public static int ans(int[] a) {
	int b[]=new int[a.length];
	int c[]=new int[a.length];
	int n=a.length;
	b[0]=a[0];
	c[n-1]=a[n-1];
	int sum=0;
	for(int i=1;i<n;i++) {
		b[i]=Math.max(a[i], b[i-1]);
	}
	for(int i=n-2;i>=0;i--){
		c[i]=Math.max(a[i],c[i+1]);
	}
	for(int i=1;i<n-1;i++) {
		int e=Math.min(b[i-1],c[i+1]);
		int q = e - a[i];
        if (q > 0) {
            sum += q;
        }
	}
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++) {
			int n=s.nextInt();
			int a[]=new int[n];
			for(int e=0;e<n;e++) {
				a[e]=s.nextInt();
			}
			System.out.print(ans(a));
		}
	}
}