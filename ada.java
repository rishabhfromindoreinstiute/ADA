// import java.util.Scanner;

// class binarySearch{
//     public static void binarysearch(int arr[],int n,int x){
//         int low=0,high=n-1;
//         int mid=(low+high)/2;
        
//         while(low<=high){
//             if(arr[mid]==x){
//                System.out.println("element found at index:"+mid);
//                break;
//             }
//             else if(x>arr[mid]){
//                 low=mid+1;
//             }
//             else if(x<arr[mid]){
//                high=mid-1;
//             } 
//             mid=(low+high)/2;
//         }
//     if(low>high){
//         System.out.println("Element not found");
//      }   
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);

//         System.out.print("Enter the number of element:");
//         int n=sc.nextInt();
        
//         int arr[]=new int[n];
//         System.out.print("Enter the sorted:");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }

//         System.out.print("Enter the number you want to find:");
//         int x=sc.nextInt();

//         binarysearch(arr,n,x);
//     }
// }


import java.util.Scanner;

class binarySearch{
    public static int binarysearch(int arr[],int x,int low,int high){
        int ans=-1;
        if(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
               ans=mid;
             }
             else if(x>arr[mid]){
                return binarysearch(arr,x,mid+1,high);
             }
             else if(x<arr[mid]){
                return binarysearch(arr,x,low,mid-1);
             } 
        } 
    return ans;
    }
    public static void main(String args[]){
        int low=0;
        int high;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of element:");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        System.out.print("Enter the sorted:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the number you want to find:");
        int x=sc.nextInt();
        high=n-1;
        int res=binarysearch(arr,x,low,high);
        if(res==-1){
           System.out.println("element not found");
        }
        else{
            System.out.println("Element found at index"+res);
        }
    }
}