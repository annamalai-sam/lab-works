const readline = require("readline-sync");
var mysql = require('mysql2');

var con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "AnnaMalai@19",
    database: "todo"
});

function listTodo() {
    con.connect((err) => {
        if (err) throw err;
        con.query("select * from todos;", function (err, result) {
            if (err) throw err;
            result.forEach(element => {
                console.log(`${element.id} ${element.todo} ${element.created_date}`);
            });
        });
        con.end();
    });
}

start_command = readline.question("press 'L' to list todo, press 'N' to create new todo,press 'D' to delete the todo : ");

if (start_command === "L") {
    listTodo();
} else if (start_command === "N") {
    con.connect((err) => {
        if (err) throw err;
        listTodo();
        new_todo = readline.question("Todo Title : ");
        todo_query = `insert into todos(todo) value("${new_todo}");`;
        // console.log(todo_query);
        con.query(todo_query, function (err, result) {
            if (err) throw err;
        });
        con.query("select * from todos;", function (err, result) {
            if (err) throw err;
            result.forEach(element => {
                console.log(`${element.id} ${element.todo} ${element.created_date}`);
            });
        });
        con.end();
    });
}
else if (start_command === "D") {
    con.connect((err) => {
        if (err) throw err;
        listTodo();
        new_todo = readline.question("Todo Title : ");
        todo_query = `DELETE FROM todos WHERE todo = '${new_todo}';`;
        con.query(todo_query, function (err, result) {
            if (err) throw err;
        });
        con.end();
        listTodo();
    });
}