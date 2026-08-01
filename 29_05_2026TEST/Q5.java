/* 
Q5. Store N strings in an ArrayList. Remove duplicate strings manually and store unique strings in 
another ArrayList. 
Input: java code java list code map 
Output: Unique List: java code list map 
Description: Traverse original ArrayList.For each element, check manually in second ArrayList using loop comparison. Do not use contains() method.  */
import java.lang.reflect.Array;
import java.util.*;
public class Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> original = new ArrayList<>();
        ArrayList<String> unique = new ArrayList<>();        
        System.out.print("ENter size: ");
        int n = sc.nextInt();
        System.out.print("Enter orignal String: ");
        for(int i=0;i<n;i++){
            original.add(sc.next());
        }
        // removing duplicate 
        for(int i=0;i<original.size();i++){
            String str = original.get(i);
            boolean found = false;
            for(int j =0;j<unique.size();j++){
                if(str.equals(unique.get(j))){
                    found = true;
                    break;
                }
            }
            if(!found){
                unique.add(str);
            }
        }
// to print unique list 
        System.out.print("Unique List: ");
        for(String s : unique){
            System.out.print(s+" ");
        }


    }
}
