//Q8. Store N words in a HashMap. Print words whose length is a prime number. 
//     Input: java python sql code spring 
// Output: Words with Prime Length :  sql 
import java.util.*;

public class Q8 {
    // find the length id prime number 
    static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0)
                return false;

        }

        return true;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Words: ");
        int n = sc.nextInt();

        HashMap<Integer, String> map = new HashMap<>();

        System.out.println("Enter Words:");

        //data inserted here in key and value pair 
        for (int i = 0; i < n; i++) {
            map.put(i, sc.next());
        }

        System.out.println("Words with Prime Length:");
        for (int i = 0; i < n; i++) {
            String word = map.get(i);
            if (isPrime(word.length())) {

                System.out.println(word);

            }

        }

    }

}