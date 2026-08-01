import java.util.*;
public class Q1{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("ENter Num: ");
    int num=sc.nextInt();

    int sqr = num*num;
    int sum =0;

    while(sqr>0){
        int digit = sqr %10;
        sum = sum+digit;
        sqr = sqr/10;


    }

    if(sum == num){
        System.out.println(num + " is a neon number..");
    }else{
        System.out.println(num + " is not neon number...");
    }
    }
}
