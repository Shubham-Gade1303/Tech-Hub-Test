// Q9. Store N words in a HashMap. Print the words that contain at least one consecutive repeated character.  
// Input: apple book java hello moon  
// Output: Words with Consecutive Repeated Characters: apple book hello moon 


import java.util.*;

public class Q9 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Words: ");
        int n = sc.nextInt();

        HashMap<Integer, String> map = new HashMap<>();

        System.out.println("Enter Words:");

        for (int i = 0; i < n; i++) {
            map.put(i, sc.next());
        }

        System.out.println("Words with Consecutive Repeated Characters:");

        for (int i = 0; i < n; i++) {

            String word = map.get(i);

            boolean found = false;

            for (int j = 0; j < word.length() - 1; j++) {

                if (word.charAt(j) == word.charAt(j + 1)) {

                    found = true;
                    break;

                }

            }

            if (found) {

                System.out.println(word);

            }

        }

    }

}