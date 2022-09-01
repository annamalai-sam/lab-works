const readline = require("readline-sync");

console.log("Enter first number");
let num1 = Number(readline.question());
console.log("Enter second number");
let num2 = Number(readline.question());
let total = num1 + num2;
console.log("The addition of this two number is : " + total);