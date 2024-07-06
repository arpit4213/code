package seperate_practice;

import java.util.Scanner;

public class square_array {
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

	public static void square(int a[]) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			a[i]=a[i]*a[i];
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
		square(a);
		quickSort(a,0,n-1);
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

}

