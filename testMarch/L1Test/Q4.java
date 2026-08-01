import java.util.*;
public class Q4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("ENter array: ");
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
       int l =0;
       int r =arr.length-1;

       while(l<r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        l++;
        r--;
       }
       System.out.print("Reverse: ");
       for(int i =0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
       }
        
        
    }
}

