// Q4. Given N strings, group together all strings having the same characters irrespective of order.      
//  Do not use collections or sorting methods.       
// Explanation - listen silent enlist    
// belong to same group.


import java.util.*;
public class Q4{
    static boolean isAnagram(String s1, String s2){
        
        if (s1.length() != s2.length())
            return false;

        int count[] = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0)
                return false;
        }

        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of Strings: ");
        int num = sc.nextInt();

        String[] arr = new String[num];
        boolean visit[] = new boolean[num];

        System.out.print("Enter Strings: ");
        for(int i=0;i<num;i++){
            arr[i]= sc.next();
        }

        int group =1;


        for(int i=0;i<num;i++){
            if(!visit[i]){
                System.out.print("Group"+ group++ +" ");
                System.err.print(arr[i]);
                visit[i]= true;


                for(int j=i+1;j<num;j++){
                    if(!visit[j] && isAnagram(arr[i],arr[j])){
                        System.out.print(arr[j]+ " ");
                        visit[j] = true;
                    }
                }
            }
        }
    }
}