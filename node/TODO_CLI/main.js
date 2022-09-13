const mysql = require('mysql2');
require('dotenv').config({ path: '../.env' });
const readline = require("readline-sync");

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
function listTodo() {
    getDataFromDB();
    console.log("List");
}

// listTodo();

function deleteTodo() {
    getDataFromDB();
    deleteValueFromDB();
    console.log("Delete");
    getDataFromDB();
}
function addTodo() {
    getDataFromDB();
    addValueToDB();
    console.log("Add");
    getDataFromDB();
}

module.exports = { addTodo, deleteTodo, listTodo };