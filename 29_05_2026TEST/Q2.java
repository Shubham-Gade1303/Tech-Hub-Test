/*2. Write a java program to print this pattern.  */
import java.util.*;

public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ener Row: ");
        int rows =sc.nextInt();

        for(int i = 0;i<=rows;i++){

            for(int j=1;j<= i;j++){ // printing left side 
                System.out.print(j+" ");
            }

               // Spaces
            for (int k = 1; k <= (rows - i) * 2; k++) {
                System.out.print("  ");
            }

                  // Right side
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            
            }
            System.out.println();
        }
    }    
}
