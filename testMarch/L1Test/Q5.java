
import java.util.Scanner;

public class Q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int[] uni = new int[size];

        int k=0;

        System.out.print("Enter Array elemets: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<arr.length;i++){
            int flag =0;
                for(int j =0 ; j<k; j++){
                    if(arr[i]== uni[j]){
                        flag=1;
                        break;
                    }
                }
                // if not duplicate add into direct unique 
               if(flag==0){
                uni[k] =arr[i];
                k++;
               } 


        }

        System.out.print("Unique elemnt: ");
        for(int i=0;i<k;i++){
            System.out.print(uni[i]+" ");
        }
    }
}