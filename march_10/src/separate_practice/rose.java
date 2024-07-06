package separate_practice;

import java.util.Scanner;

public class rose {
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
    static void sol(int a[],int tar){
    	int n=a.length;
    	int tempi=0;
    	int tempe=0;
    	int diff=Integer.MAX_VALUE;
    	//for(int i=0;i<n-1;i++) {
    		//for(int e=1;e<n;e++) {
    		int i=0;
    		int e=n-1;
    		while(i<e) {
    		if(a[i]+a[e]==tar) {
    				if(diff>a[e]-a[i]) {
    				tempi=i;
    				tempe=e;
    				diff=a[e]-a[i];
    			}
    				else if(a[i]+a[e]<tar) {
    					i++;
    				}
    				else {
    					e--;
    				}
    		}
    		}
    //}
    	//}
    	System.out.println("Deepak should buy roses whose prices are "+a[tempi]+" and "+a[tempe]+".");
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
			int tar=s.nextInt();
			quickSort(a,0,n-1);
			sol(a,tar);
		}

	}

}
