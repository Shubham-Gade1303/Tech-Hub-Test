import java.util.*;
class Q9_WordPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        String word = "";

        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                boolean isPalindrome = true;

                for (int j = 0; j < word.length() / 2; j++) {
                    if (word.charAt(j) != word.charAt(word.length() - 1 - j)) {
                        isPalindrome = false;
                        break;
                    }
                }
                if (isPalindrome && word.length() > 0) {
                    System.out.print(word + " ");
                }

                word = "";
            } 
            else {
                
                word = word + str.charAt(i);
            }
        }
    }
}