
// //Q10. Store N Words in a HashMap and Print Words with Unique Character  
// Frequencies. 
// Write a Java program to store N words in a HashMap. For each word, calculate the  
// frequency of every character. Print only those words in which the frequency of 
// every distinct character is unique. 
// If two or more characters have the same frequency in a word, that word should not 
// be printed. 
// Input 
// 6 
// aabbccc 
// aabbcc 
// banana 
// abcde 
// mississippi 
// programming 
 
// Output 
// Words with Unique Character Frequencies: 
// aabbccc 
// banana 
// abcde 
 
 
 
 

import java.util.*;

public class Q10 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Words: ");
        int n = sc.nextInt();

        HashMap<Integer, String> map = new HashMap<>();

        System.out.println("Enter Words:");

        for (int i = 0; i < n; i++) {

            map.put(i, sc.next());

        }

        System.out.println("Words with Unique Character Frequencies:");

        for (int i = 0; i < n; i++) {

            String word = map.get(i);

            int freq[] = new int[256];

            for (int j = 0; j < word.length(); j++) {

                freq[word.charAt(j)]++;

            }

            boolean unique = true;

            for (int j = 0; j < 256; j++) {

                if (freq[j] > 0) {

                    for (int k = j + 1; k < 256; k++) {

                        if (freq[k] > 0 && freq[j] == freq[k]) {

                            unique = false;

                        }

                    }

                }

            }

            if (unique) {

                System.out.println(word);

            }

        }

    }

}