/* Q7. Store N words in a HashMap. Print words that contain at least two vowels. 
Input: java code map idea list 
Output: Words with at least 2 vowels: java code idea 
Description: Store words in HashMap. Traverse each word manually and count vowels. */
import java.util.*;
import java.util.Map;
public class Q7 {
    public static boolean hasTwoVowel(String words){
        int count =0;
        for(int i=0;i<words.length();i++){
            char ch = words.charAt(i);
            if(ch =='a' || ch =='e' || ch=='i'  || ch =='o' || ch =='u' ||
               ch=='A'  || ch =='E' || ch =='I' || ch == 'O'|| ch =='U'){
                count++;
            }
        }
        if(count >=2)
            return true;
        else
            return false; 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap <Integer, String> map = new HashMap<>();

        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        System.out.println("Enter Words: ");
        for(int i=0;i<n;i++){
            String words = sc.next();
            map.put(i, words);  // put wordss int the map 
        }
        System.out.println("Words atleat 2 vowel: ");
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            String words = entry.getValue();

            if(hasTwoVowel(words)){
                System.out.print(words + " ");
            }
        }


    }
}
