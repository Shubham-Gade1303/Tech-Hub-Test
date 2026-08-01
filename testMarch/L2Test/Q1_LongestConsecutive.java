
import java.util.Scanner;

public class Q1_LongestConsecutive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENter size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter array: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int maxLen = 0;
        for(int i=0;i<size;i++){
            int current = arr[i];
            int count =1;

            boolean found =true;
            while(found){
                found=false;
                for(int j=0;j<size;j++){
                    if(arr[j] == current+1){
                        current++;
                        count++;
                        found = true;
                        break;
                    }
                
            }
            if(count > maxLen){
                maxLen = count;
            }
        }
        System.out.println("Longest consicative sequence: "+ maxLen);
    }
}