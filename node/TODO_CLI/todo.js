const readline = require("readline-sync");
let todo = require("./main");

function kickOffTodo() {
    let startCommand = readline.question("press 'L' to list todo, press 'N' to create new todo,press 'D' to delete the todo, press 'END' to end the app : ");

    switch (startCommand) {
        case "L":
            todo.listTodo();
            kickOffTodo();
            break;
        case "N":
            todo.addTodo();
            kickOffTodo();
            break;
        case "D":
            todo.deleteTodo();
            kickOffTodo();
            break;
        case "End":
            break;
    }
}
kickOffTodo();