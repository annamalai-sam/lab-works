const readline = require("readline-sync");
// let todo = require("./main");
const mysql = require('mysql2');
require('dotenv').config();

function getDataFromDB() {
    var con = mysql.createConnection({
        host: process.env.DB_HOST,
        user: process.env.DB_USER_NAME,
        password: process.env.DB_PASSWORD,
        database: "todo"
    });
    // console.log("==========================");
    con.connect((err) => {
        if (err) throw err;
        // console.log("==========================");
        con.query("select * from todos;", function (err, result) {
            if (err) throw err;
            if (result.length == 0) {
                console.log("Northing in todolist");
            } else {
                console.log("================================================================");
                result.forEach(element => {
                    const currentDate = new Date(element.created_date);
                    const currentDayOfMonth = currentDate.getDate();
                    const currentMonth = currentDate.getMonth();
                    const currentYear = currentDate.getFullYear();
                    const dateString = `${currentDayOfMonth}/${currentMonth + 1}/${currentYear}`;
                    console.log(`Todo : ${element.todo} , Created date : ${dateString}`);
                });
                console.log("================================================================");
            }
        });
        con.end();
    });
}
// getDataFromDB();

function deleteValueFromDB() {
    var con = mysql.createConnection({
        host: process.env.DB_HOST,
        user: process.env.DB_USER_NAME,
        password: process.env.DB_PASSWORD,
        database: "todo"
    });
    con.connect((err) => {
        if (err) throw err;
        new_todo = readline.question("Todo Title to delete: ");
        todo_query = `DELETE FROM todos WHERE todo = '${new_todo}';`;
        con.query(todo_query, function (err, result) {
            if (err) throw err;
        });
        con.end();
    });
}

// deleteValueFromDB();

function addValueToDB() {
    var con = mysql.createConnection({
        host: process.env.DB_HOST,
        user: process.env.DB_USER_NAME,
        password: process.env.DB_PASSWORD,
        database: "todo"
    });
    con.connect((err) => {
        if (err) throw err;
        new_todo = readline.question("Todo Title to add todo : ");
        todo_query = `insert into todos(todo) value("${new_todo}");`;
        // console.log(todo_query);
        con.query(todo_query, function (err, result) {
            if (err) throw err;
        });
        con.end();
    });
}

// addValueToDB();


function kickOffTodo() {
    let startCommand = readline.question("press 'L' to list todo, press 'N' to create new todo,press 'D' to delete the todo, press 'END' to end the app : ");
    console.log(startCommand);
    
    // if (startCommand == "L") {
    //     getDataFromDB();
    //     kickOffTodo();
    // }
    // else if (startCommand == "N") {
    //     getDataFromDB();
    //     addValueToDB();
    //     getDataFromDB();
    //     kickOffTodo();
    // }
    // else if (startCommand == "D") {
    //     getDataFromDB();
    //     deleteValueFromDB();
    //     getDataFromDB();
    //     kickOffTodo();
    // }
    // else if (startCommand == "END") {

    // }
    // else {

    // }
    // switch (startCommand) {
    //     case "L":
    //         getDataFromDB();
    //         kickOffTodo();
    //         break;
    //     case "N":
    //         getDataFromDB();
    //         addValueToDB();
    //         getDataFromDB();
    //         kickOffTodo();
    //         break;
    //     case "D":
    //         getDataFromDB();
    //         deleteValueFromDB();
    //         getDataFromDB();
    //         kickOffTodo();
    //         break;
    //     case "End":
    //         break;
    // }
}
// kickOffTodo();