import java.util.*;
public class Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        //
        for(int i=1;i<=num;i++){
            int temp =i;
            int sum =0;

            while(temp>0){
                int digit = temp %10;

                int fact =1;
                for(int j=1;j<=digit;j++){
                    fact = fact*j;
                }

                sum = sum  + fact;
                temp = temp /10;

            }
            if(sum == i){
                System.out.print(i+" ");
            }

        }

    }
}
