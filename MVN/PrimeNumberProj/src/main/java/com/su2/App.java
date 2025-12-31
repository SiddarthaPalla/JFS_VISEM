package com.su2;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n=sc.nextInt();
        System.out.println("Enter the last number");
        int m=sc.nextInt();
        checkPrime(n, m);
        sc.close();
    }
    public static void checkPrime(int n,int m)
    {
        boolean arr[]=new boolean[m+1];
        Arrays.fill(arr,true);
        for(int i=2;i*i<=m;i++)
        {
            if(arr[i]){
                for(int j=i*i;j<=m;j+=i){
                    arr[j]=false;
                }
            }
            
        }
        for(int i=n;i<=m;i++){
            if(arr[i]){
                System.out.println(i);
            }
        }
        // System.out.println();
    }
}

// public class App 
// {
//     public static void main( String[] args )
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a number :- ");
//         int n=sc.nextInt();
//         if(n<=1)
//         {
//             System.out.println(n+" is not a prime number");
//         }
//         else
//         {
//             if(checkPrime(n))
//             {
//                 System.out.println(n+" is a prime number.");
//             }
//             else
//             {
//                 System.out.println(n+" is not a prime number.");
//             }
//             sc.close();
//         }
//     }
//     public static boolean checkPrime(int n)
//     {
//         for(int i=2;i<=Math.sqrt(n);i++)
//         {
//             if(n%i==0) return false;
//         }
//         return true;
//     }
// }