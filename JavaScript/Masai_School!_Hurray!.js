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


function runProgram(input){
    var N = Number(input);
    if(N%35===0){
        console.log("Masai School");
    }else if(N%5===0){
        console.log("School");
    }else if(N%7===0){
        console.log("Masai");
    }else {
        console.log("Hurray!");
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