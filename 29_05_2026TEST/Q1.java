
/*Q1. Write a java program to check Number Is happy Number or Not happy using function recursion.*/
import java.util.Scanner;
public class Q1 {

    // Function to calculate sum of square of digits
    static int sumSquare(int num) {
        if (num == 0) {
            return 0;
        }
        int digit = num % 10;
        return (digit * digit) + sumSquare(num / 10);
    }
    // Recursive function to check happy number
    static boolean isHappy(int num) {
        if (num == 1) {
            return true;
        }
        if (num == 4) {
            return false;
        }
        return isHappy(sumSquare(num));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (isHappy(num)) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Not Happy Number");
        }
    }
}
