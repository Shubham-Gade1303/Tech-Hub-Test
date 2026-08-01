/*4. Store N integers in an ArrayList. Rotate the elements to the right by one position. 
Input: 5 
10 20 30 40 50 
Output: Rotated List: 50 10 20 30 40 
Description: tore elements in ArrayList. Move last element to first position manually. Shift remaining elements one position forward. Do not use Collections.rotate().  */


import java.util.*;
public class Q4 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter size: ");
        int n = sc.nextInt();
        
        System.out.print("Enter Elements: ");
        for(int i=0;i<n;i++){
        list.add(sc.nextInt());
        }

        int last = list.get(n-1);// to store elemt 

        for(int i=n-1;i>0;i--){
            list.set(i, list.get(i-1));
        }

        list.set(0, last);
        System.out.println(" After Rotated ");

        for(int num : list){
            System.out.print(num+" ");
        }


        

    }
}
