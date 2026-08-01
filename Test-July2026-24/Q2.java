
import java.util.Scanner;


// Q2. Design a queue using an array. Remove all occurrences of a given element.
//  Explanation Traverse and skip matching elements.    Input - Queue: 10, 20, 10, 30    
//  Remove: 10    
// Output - Queue: 20 30 
public class Q2{
    public static  void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Quese Size: ");
        int size = sc.nextInt();

        int[] queue = new int[size];
        System.out.print("Enter Queue Element: ");
        for(int i=0;i<size;i++){
            queue[i] = sc.nextInt();
        }

        System.out.print("Enter To delete Element: ");
        int deleteElement = sc.nextInt();

        // after remove duplicate elements: 
        System.out.println("After remove Duplicate then Queue: ");
        for(int i=0;i<queue.length;i++){
            if(queue[i] != deleteElement){
                System.out.print(queue[i]+" ");
            }
        }
    }
}