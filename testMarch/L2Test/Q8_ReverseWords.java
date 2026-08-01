import java.util.*;
public class Q8_ReverseWords{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();

        String word ="";
        String result ="";

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch !=' '){
                word = ch + word;// reverse word;


            }   else{
                result = result + word + " ";
                word ="";
            }
        }
        result = result + word;
        System.out.println(result);
    }
}