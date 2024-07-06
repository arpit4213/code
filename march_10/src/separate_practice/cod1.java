package separate_practice;
import java.util.*;
public class cod1 {
	static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
	public static void sol(int[] a,int tar) {
		int n=a.length;
		for(int i=0;i<n-2;i++) {
			int e=i+1;
			int l=n-1;
			//System.out.println("inner");
			while(e<l) {
				//System.out.println("inn1");
				if(a[i]+a[e]+a[l]==tar) {
					System.out.println(a[i]+", "+a[e]+" and "+a[l]);
					e++;
					l--;
				}
				else if(a[i]+a[e]+a[l]<tar) {
					e++;
				}
				else {
					l--;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();	
		}
		int t=s.nextInt();
		quickSort(a,0,n-1);
		sol(a,t);
	}

}
