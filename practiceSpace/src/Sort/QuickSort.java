package Sort;
import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class QuickSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        quickSort(arr,0,arr.length-1);

        for(int num:arr){
            System.out.print(num+" ");
        }

        scan.close();
    }

    public static void quickSort(int[] arr,int left,int right){
        if(left<right){
            int mid = partition(arr,left,right);
            quickSort(arr,left,mid-1);
            quickSort(arr,mid+1,right); 
        }
    }

    public static int partition(int[] arr,int left,int right){
        int pivot = left;
        int index = pivot+1;

        for(int i = index;i<=right;i++){
            if(arr[i]<arr[pivot]){
                swap(arr,i,index);
                index++;
            }
        }

        swap(arr,pivot,index-1);

        return index-1;
    }


    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}