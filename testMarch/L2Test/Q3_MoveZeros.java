import  java.util.*;
public class Q3_MoveZeros{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");

        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Array: ");

        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }

        int[] temp = new int[size];
        int index =0;

        for(int i=0;i<size;i++){
            if(arr[i]!=0){
                temp[index++] = arr[i];
            }
        }

        while(index <size){
            temp[index++] =0;
        }
        System.out.print("Modify array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(temp[i]+" ");
        }
    }
}