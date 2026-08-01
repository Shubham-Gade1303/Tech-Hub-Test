// Q3. Create a class named PrimeArrayManager using a parameterized 
// constructor that accepts an integer array.  
// The constructor should initialize the array, and the class should provide 
// methods to perform the following operations:  
// 1. Separate all Prime Numbers and Non-Prime Numbers.   
// 2. Sort the Prime Numbers in Ascending Order.   
// 3. Sort the Non-Prime Numbers in Descending Order.   
// 4. Merge both arrays such that all sorted prime numbers appear first, 
// followed by all sorted non-prime numbers.   
// 5. Display the Prime Numbers, Non-Prime Numbers, and the Final Merged 
// Array.  Do not use Java Collections or built-in sorting methods. Implement 
// the sorting logic manually.  
// Input - Enter the size of array - 8              
// Enter the array elements - 15 7 11 20 13 4 17 9  
// Output - Prime Numbers : 7 11 13 17    
// Non Prime Numbers : 20 15 9 4    
// Final Array : 7 11 13 17 20 15 9 4 

import java.util.Scanner;

class PrimeArrayManager {

    int arr[];

    PrimeArrayManager(int a[]) {
        arr = a;
    }

    boolean isPrime(int num) {

        if (num <= 1)
            return false;

        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0)
                return false;
        }

        return true;
    }

    void process() {

        int prime[] = new int[arr.length];
        int nonPrime[] = new int[arr.length];

        int p = 0;
        int np = 0;

        // Separate Prime and Non Prime
        for (int i = 0; i < arr.length; i++) {

            if (isPrime(arr[i])) {
                prime[p++] = arr[i];
            } else {
                nonPrime[np++] = arr[i];
            }

        }

        // Sort Prime Ascending
        for (int i = 0; i < p - 1; i++) {

             for (int j = i + 1; j < p; j++) {

                if (prime[i] > prime[j]) {

                    int temp = prime[i];
                    prime[i] = prime[j];
                    prime[j] = temp;

                }

            }

        }

        // Sort Non Prime Descending
        for (int i = 0; i < np - 1; i++) {

            for (int j = i + 1; j < np; j++) {

                if (nonPrime[i] < nonPrime[j]) {

                    int temp = nonPrime[i];
                    nonPrime[i] = nonPrime[j];
                    nonPrime[j] = temp;

                }

            }

        }

        System.out.print("Prime Numbers : ");

        for (int i = 0; i < p; i++) {
            System.out.print(prime[i] + " ");
        }

        System.out.println();

        System.out.print("Non Prime Numbers : ");

        for (int i = 0; i < np; i++) {
            System.out.print(nonPrime[i] + " ");
        }

        System.out.println();

        System.out.print("Final Array : ");

        for (int i = 0; i < p; i++) {
            System.out.print(prime[i] + " ");
        }

        for (int i = 0; i < np; i++) {
            System.out.print(nonPrime[i] + " ");
        }

    }

}

public class Q3 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");

        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter Array Elements:");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

        PrimeArrayManager obj = new PrimeArrayManager(arr);

        obj.process();

    }

}