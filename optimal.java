import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class optimal {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int N=sc.nextInt();
        int a[]=new int[N];
        System.out.println("Enter the element in the array:");
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        ArrayList<Integer>v=new ArrayList<Integer>();
        int sum=a[0];
        int sum2=0;
        for(int i=1;i<N;i++){
            sum2=a[i]+a[i+1];
            if((sum+a[i])<=sum2){
                sum+=a[i];
                v.add(sum);
            }else{
                sum+=sum2;
                i++;
                v.add(sum2);
                v.add(sum);
            }
        }
        // for(int i=0;i<N;i++){
        //     System.out.println(arr[i]);
        //}
        System.out.println("Optimal solution:"+v);
    }
}
