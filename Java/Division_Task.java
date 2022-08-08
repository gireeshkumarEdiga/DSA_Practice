// Description

// You are given a number N. Let us say the floor ( Ref:https://en.wikipedia.org/wiki/Floor_and_ceiling_functions) of 32 divided by N is x

// Print as per following rules

// * In case x is 0, print "Too Low"

// * In case it is not possible to generate a valid number, print -1

// * In all other cases, print x


// Input
// Input Format :

// First line contains N


// Constraints :

// N <= 100


// Output
// Output string or number based on the conditions mentioned above


// Sample Input 1 

// 4
// Sample Output 1

// 8


import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = 32;
        int result = M/N;
        if(result == 0){
            System.out.println("Too Low");
        }else if(N<=0){
            System.out.println("-1");
        }else {
            System.out.println(result);
        }
    }
}