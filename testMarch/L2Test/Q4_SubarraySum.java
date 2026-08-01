
import java.util.Scanner;

public class Q4_SubarraySum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter arry: ");

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter sum: ");
        int target = sc.nextInt();

        for(int i=0;i<size;i++){
            int sum =0;

            for(int j=i;j<size;j++){
                sum = sum + arr[j];

                if(sum == target){
                    System.out.print("SubArray found at " + i + " - "+ j);
                    return;
                }
            }
        }
        System.out.println("SubArray not found..");
    }

}