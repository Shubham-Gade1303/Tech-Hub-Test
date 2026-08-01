//Q7. Store N integers in an ArrayList.
//  Rotate the elements to the right by one position. 
// Input: 5 10 20 30 40 50 
// Output: Rotated List: 50 10 20 30 40 

import java.util.*;

public class Q7 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println("Enter Elements:");

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        //last index 
        int last = list.get(n - 1);

        for (int i = n - 1; i > 0; i--) {
            list.set(i, list.get(i - 1));
        }
        //set the last index at 0 index 
        list.set(0, last);


        // then show the rotated Array
        System.out.println("Rotated List:");
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}