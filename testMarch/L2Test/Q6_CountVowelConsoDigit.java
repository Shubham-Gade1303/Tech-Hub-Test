
import java.util.Scanner;

public class Q6_CountVowelConsoDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();

        int vowel =0;
        int conso =0;
        int digit =0;
        int word =1;

     for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);

        if(ch == ' '){
            word++;
        }
        if(ch >= '0' && ch <='9'){
            digit++;
        }
        else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowel++;
                } else {
                    conso++;
                }
            }
        }
     System.out.println("word "+ word);
     System.out.println("vowels "+ vowel);
     System.out.println("conso "+ conso);
     System.out.println("digit "+ digit);
    }
}