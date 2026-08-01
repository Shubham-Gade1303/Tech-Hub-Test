/*Q3. Store multiple words and group them according to their length using HashMap<Integer, 
ArrayList<String>>. Input Example: ["java","sql","python","c","html"] 
Output Example: 
1 → [c] 3 → [sql] 4 → [java, html] 6 → [python]  */


import java.util.*;
public class Q3 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        HashMap <Integer, ArrayList<String>> map = new HashMap<>();
            System.out.print("Size: ");
            int n = sc.nextInt();
            sc.nextLine();

            for(int i=0;i<n;i++){
                System.out.print("Enter NAme List : ");
                String word = sc.next();

                int len = word.length();

                if(!map.containsKey(len)){
                    map.put(len, new ArrayList<String>());
                }

                map.get(len).add(word);
            }
            System.out.println(" Group of words: ");

            for(Integer key : map.keySet()){
                System.out.println(key +" -> "+map.get(key));
            }
    }
}
