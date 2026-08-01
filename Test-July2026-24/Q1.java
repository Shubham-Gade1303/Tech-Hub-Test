//Q1. Write a java program to print this pattern. //


import java.util.*;
public class Q1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    
    
    }
}