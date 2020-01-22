package bubble_sort;
import java.util.Scanner;
public class ques1 {
	
	
	void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp1 = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp1;
                }
    }
 
	 void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n;i++)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 ques1 o = new ques1();
		 	int a=sc.nextInt();
	        int arr[] = new int[a];
	        for(int i=0;i<a;i++) {
	        	arr[i]=sc.nextInt();
	        }
	        o.bubbleSort(arr);
	        System.out.println("Sorted array");
	        o.printArray(arr);
		

	}

}
