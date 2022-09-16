const readline = require("readline-sync")
let arguments = process.argv
function add(a, b) {
    return a + b
}
console.log(add(parseInt(arguments[2]), parseInt(arguments[3])))