// Description

// You are given two integers, L and R. You have to print all the numbers between L and R, L and R inclusive, such that the current number is the double of the previous number. Refer the sample I/O for better understanding.


// Input
// The first and the only line of the input contains L and R, the two numbers.



// Constraints

// 1 <= L,R <= 300


// Output
// Print all the values between the range of L and R, such that the current value is the double of the previous value, as shown in the sample testcase


// Sample Input 1 

// 4 10
// Sample Output 1

// 4 
// 8


function runProgram(input){
    var [a,b] = input.split(" ").map(Number);
    for(var i=a; i<=b; i*=2){
        console.log(i);
    }
}

process.stdin.resume();
process.stdin.setEncoding("ascii");
let read = "";
process.stdin.on("data", function (input) {
    read += input;
});
process.stdin.on("end", function () {
    read = read.replace(/\n$/,"")
   runProgram(read);
});

process.on("SIGINT", function () {
    read = read.replace(/\n$/,"")
    runProgram(read);
    process.exit(0);
});