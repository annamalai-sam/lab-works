require('dotenv').config({ path: './../../.env' });
const readline = require("readline-sync");
let todo = require("./main");


function deleteTodo() {
    console.log("Delete");
    const DB_details = todo.getDbConnection(process.env.DB_HOST, process.env.DB_USER_NAME, process.env.DB_PASSWORD, "todo");
    todo.getDataFromDB(DB_details, "select * from todos;");
    new_todo = readline.question("Todo Title to delete: ");
    getDBQuery(DB_details, `DELETE FROM todos WHERE todo = '${new_todo}';`);
    getDataFromDB(DB_details, "select * from todos;");
}

module.exports = { deleteTodo }