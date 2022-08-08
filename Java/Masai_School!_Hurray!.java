// Description

// You are provided an integer N. Depending upon the value, you have to print a string as per the following rules:

// - Print "Masai" (without quotes) if the integer is a multiple of 7

// - Print "School" (without quotes) if the integer is a multiple of 5

// - Print "Masai School" (without quotes) if the integer is a multilpe of 35

// - Else in all other cases print "Hurray!" (without quotes)


// Input
// Input Format :

// First line contains N



// Constraints :

// N<100


// Output
// Output one of the 4 possible strings


// Sample Input 1 

// 7
// Sample Output 1

// Masai



import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N%35==0){
            System.out.println("Masai School");
        }else if(N%7==0){
            System.out.println("Masai");
        }else if(N%5==0){
            System.out.println("School");
        }else{
            System.out.println("Hurray!");
        }
    }
}