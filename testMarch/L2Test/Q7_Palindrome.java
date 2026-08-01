
import java.util.Scanner;

public class Q7_Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();

        int maxlen = 0;
        String result ="";
            for(int i=0;i<s.length();i++){
                for(int j=i;j<s.length();j++){
                    boolean ispalindrome = true;

                    for(int k=0; k<(j-i)/2;k++){
                        if(s.charAt(i+k) != s.charAt(j-k)){
                            ispalindrome=false;
                            break;
                        }
                    }
                    if(ispalindrome  && (j-i+1)>maxlen){
                        maxlen=j-i+1;
                        result = s.substring(i,j+1);                    }
                }
            }
            System.out.println("Longest palindrom String is : "+ result);
    }
}