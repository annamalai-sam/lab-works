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
            if (result.length == 0) {
                console.log("Northing in todolist");
            } else {
                result.forEach(element => {
                    const currentDate = new Date(element.created_date);
                    const currentDayOfMonth = currentDate.getDate();
                    const currentMonth = currentDate.getMonth();
                    const currentYear = currentDate.getFullYear();
                    const dateString = `${currentDayOfMonth}/${currentMonth + 1}/${currentYear}`;
                    console.log(`Todo : ${element.todo} , Created date : ${dateString}`);
                });
            }
        });
        con.end();
        // con.close();
    });
}

start_command = readline.question("press 'L' to list todo, press 'N' to create new todo,press 'D' to delete the todo : ");

if (start_command === "L") {
    listTodo();
} else if (start_command === "N") {
    con.connect((err) => {
        if (err) throw err;
        con.query("select * from todos;", function (err, result) {
            if (err) throw err;
            if (result.length == 0) {
                console.log("Northing in todolist");
            } else {
                result.forEach(element => {
                    const currentDate = new Date(element.created_date);
                    const currentDayOfMonth = currentDate.getDate();
                    const currentMonth = currentDate.getMonth();
                    const currentYear = currentDate.getFullYear();
                    const dateString = `${currentDayOfMonth}/${currentMonth + 1}/${currentYear}`;
                    console.log(`Todo : ${element.todo} , Created date : ${dateString}`);
                });
            }
            new_todo = readline.question("Todo Title to add todo : ");
            todo_query = `insert into todos(todo) value("${new_todo}");`;
            // console.log(todo_query);
            con.query(todo_query, function (err, result) {
                if (err) throw err;
            });
            con.query("select * from todos;", function (err, result) {
                if (err) throw err;
                if (result.length == 0) {
                    console.log("Northing in todolist");
                } else {
                    result.forEach(element => {
                        const currentDate = new Date(element.created_date);
                        const currentDayOfMonth = currentDate.getDate();
                        const currentMonth = currentDate.getMonth();
                        const currentYear = currentDate.getFullYear();
                        const dateString = `${currentDayOfMonth}/${currentMonth + 1}/${currentYear}`;
                        console.log(`Todo : ${element.todo} , Created date : ${dateString}`);
                    });
                }
            });
            con.end();
        });
    });
}
else if (start_command === "D") {
    con.connect((err) => {
        if (err) throw err;
        con.query("select * from todos;", function (err, result) {
            if (err) throw err;
            if (result.length == 0) {
                console.log("Northing in todolist");
                // con.end();
            } else {
                result.forEach(element => {
                    const currentDate = new Date(element.created_date);
                    const currentDayOfMonth = currentDate.getDate();
                    const currentMonth = currentDate.getMonth();
                    const currentYear = currentDate.getFullYear();
                    const dateString = `${currentDayOfMonth}/${currentMonth + 1}/${currentYear}`;
                    console.log(`Todo : ${element.todo} , Created date : ${dateString}`);
                });
                new_todo = readline.question("Todo Title to delete: ");
                todo_query = `DELETE FROM todos WHERE todo = '${new_todo}';`;
                con.query(todo_query, function (err, result) {
                    if (err) throw err;
                });
                con.query("select * from todos;", function (err, result) {
                    if (err) throw err;
                    if (result.length == 0) {
                        console.log("Northing in todolist");
                        // con.end();
                    } else {
                        result.forEach(element => {
                            const currentDate = new Date(element.created_date);
                            const currentDayOfMonth = currentDate.getDate();
                            const currentMonth = currentDate.getMonth();
                            const currentYear = currentDate.getFullYear();
                            const dateString = `${currentDayOfMonth}/${currentMonth + 1}/${currentYear}`;
                            console.log(`Todo : ${element.todo} , Created date : ${dateString}`);
                        });
                    }
                });
            }
            con.end();
        });
    });
}