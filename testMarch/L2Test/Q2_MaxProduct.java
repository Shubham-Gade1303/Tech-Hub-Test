
import java.util.Scanner;

public class Q2_MaxProduct{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[]  arr = new int[size];

        System.out.print("Enter elements: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int maxPro = arr[0];

        for(int i=0;i<size;i++){
            int product= 1;
            for(int j=i;j<size;j++){
                product = product* arr[j];

                if(product>maxPro){
                    maxPro=product;
                }
            }
        }
        System.out.println("Max product is : "+ maxPro);

    }
}