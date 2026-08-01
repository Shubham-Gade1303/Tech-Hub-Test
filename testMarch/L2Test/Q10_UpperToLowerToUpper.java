import java.util.*;
public class Q10_UpperToLowerToUpper{
    public static void main(String[] args) {
     Scanner  sc = new Scanner(System.in); 
     
     System.out.print("Enter String: ");
     String s = sc.nextLine();
     String result ="";


     for(int i=0;i<s.length();i++){// to check each character
        char ch = s.charAt(i);

        if(ch >=  'A'  && ch <='Z'){
            ch = (char)(ch+32); // to convert lowercase
        }else if(ch >= 'a' && ch <= 'z'){
            ch = (char)(ch-32);// to convert uppercase;
        }

        result = result +ch;
     }
     System.out.println("After conversion: "+result);

    }
}