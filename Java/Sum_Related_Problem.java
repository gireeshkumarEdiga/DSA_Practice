// Sum Related Problem -7082:12:5
// Description

// You are given a number N, find sum of all even numbers which occur before N (inclusive of N if N is even)


// Input
// Input Format

// First and the only line contains one number N.

// Constraints

// N<10000


// Output
// Output Format

// Output one number which is sum (under above condition)


// Sample Input 1 

// 8
// Sample Output 1

// 20


import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sumofEven = 0;
        for(int i=0; i<=N; i++){
            if(i%2==0){
                sumofEven+=i;
            }
        }
        System.out.println(sumofEven);
    }
}