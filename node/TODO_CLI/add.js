require('dotenv').config({ path: './../../.env' });
const readline = require("readline-sync");
let todo = require("./main");

function addTodo() {
    new_todo = readline.question("Todo Title to add todo : ");
    console.log(`insert into todos(todo) value("${new_todo}");`);
    const DB_details = getDbConnection(process.env.DB_HOST, process.env.DB_USER_NAME, process.env.DB_PASSWORD, "todo");
    getDBQuery(DB_details, `insert into todos(todo) value("${new_todo}");`);
}