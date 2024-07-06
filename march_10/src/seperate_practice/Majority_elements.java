package seperate_practice;

import java.util.Scanner;

public class Majority_elements {
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


	public static void sol(int a[]) {
		double b=a[0];
		double count=0;
		int n=a.length;
		double c=Math.floor(n/3);
		for(int i=0;i<n;i++) {
			if(a[i]==b) {
				count++;
			}
			else {
				count=1;
				b=a[i];
			}
			
			if(count>c) {
				System.out.print(a[i]+" ");
			}
			else {
				System.out.print("No Majority Elements");
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
		quickSort(a,0,n-1);
		sol(a);
	}

}
