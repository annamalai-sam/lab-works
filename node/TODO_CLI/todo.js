const readline = require("readline-sync");
const todo = require("./main");

 async function kickOffTodo() {
    let startCommand = readline.question("press 'L' to list todo, press 'N' to create new todo,press 'D' to delete the todo, press 'END' to end the app : ");
    switch (startCommand) {
        case "L":
           await todo.listTodo()

            setTimeout(() => {
                                kickOffTodo()

            }, 2000);
             
            break;
        case "N":
            todo.addTodo();
            kickOffTodo();
            break;
        case "D":
            todo.deleteTodo();
            kickOffTodo();
            break;
        case "END":
            break;
        default:
            console.log("Command not found ");
            kickOffTodo();
            break;
        
    }
//kickOffTodo()

    //  todo.addTodo();
    //  todo.deleteTodo(); 
    //   todo.listTodo();
}
kickOffTodo();