const readline = require("readline-sync");

// console.log("Run java");
let num1 = Number(readline.question("Enter first number : "));
let num2 = Number(readline.question("Enter second number : "));
let total = num1 + num2;
console.log(`The addition of this two number is :   ${total}`);
readline.setDefaultOptions({ print: "Enter first number" });