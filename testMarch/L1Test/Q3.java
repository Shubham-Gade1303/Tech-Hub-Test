
import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int term =3;
        System.out.print("series: ");
        

        for(int i=1;i<=num;i++){
            System.out.print(term+" ");
            term = term *2;
        }
    }
}