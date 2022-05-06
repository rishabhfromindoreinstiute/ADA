import java.util.Scanner;
class quickSort {

static void quicksort(int arr[],int low,int high){
    if(low<high){
        int pi=partition(arr,low,high);
        quicksort(arr,low,pi-1);
        quicksort(arr,pi+1,high);
    }
}
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
 
    for(int j = low; j <= high - 1; j++)
    {
         
        // If current element is smaller
        // than the pivot
        if (arr[j] < pivot)
        {
            // Increment index of
            // smaller element
            i++;
            swap(arr, i, j);
        }
    }
    swap(arr, i + 1, high);
    return (i + 1);
}
    static void printArray(int arr[]){
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of element:");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Array before sorting");
        printArray(arr);
        int high=n-1;
        int low=0;
        quicksort(arr,low,high);
        System.out.println("Array after sorting");
        printArray(arr);
    }
}
