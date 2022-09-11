// let person = {
//     firstName: 'John',
//     lastName: 'Doe'
// };

// (() => {
//     console.log(person.firstName + ' ' + person.lastName);
// })
//     (person);

function annaMalai(function1, function2){
    console.log("Test");
    console.log(function2);
    return function1;
}
annaMalai(function (Error) {
    console.log("Welcome to GeeksforGeeks!");
    console.log(" No " + Error);
}, 2000);

console.log("Annamalai");