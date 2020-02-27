/* CS245 Practice Assignment 5 Quick Sort 
victoria nerecina
this program:

requirement 2:
Quick Sort with first element as pivot 
chosen because average runtime is same as best runtime
worst case, the digit integers are already in order

Quick Sort:
	divide array to two subarrays
	recursively sort the two subarrays
	combine the two sorted subaraays

Runtime:
	best: big-O(nlgn)
	worst: big-O(n^2)
	average: big-O(nlgn)

*/

public class QuickSort5 
{
    public static int partition(int a[], int left, int right)
    { 
        int pivot = a[right];  
        int i = (left - 1); // index of smaller element 
        for (int j = left; j < right; j++) 
        { 
            // If current element is smaller than the pivot 
            if (a[j] < pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = a[i]; 
                a[i] = a[j]; 
                a[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = a[i+1]; 
        a[i+1] = a[right]; 
        a[right] = temp; 
  
        return i+1; 
    } 
  

    public static void quicksort(int a[], int left, int right)
    { //a[] is the array to be sorted
        if (left < right)  //starting index < ending index
        { 
            int partitionIndex = partition(a, left, right); 
  
            quicksort(a, left, partitionIndex - 1); 
            quicksort(a, partitionIndex + 1, right); 
        } 
    }

    public static void quicksort(int a[]){
        quicksort(a, 0, a.length-1);
    }

    //test
    // public static void main(String [] args)
    // {
    // 	int a[] = {9, 1 ,0 ,0};
    // 	QuickSort5 q = new QuickSort5();
    // 	q.quicksort(a, 0, a.length - 1);

    // 	for (int x = 0; x < a.length; ++x)
    // 	{
    // 		System.out.print(a[x] + " ");
    // 	}

    // 	System.out.println();
    // }

}
	