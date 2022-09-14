const mysql = require('mysql2');
require('dotenv').config({ path: './../../.env' });
const readline = require("readline-sync");

function getDbConnection(host, userName, password, db_name) {
    var con = mysql.createConnection({
        host: host,
        user: userName,
        password: password,
        database: db_name
    });
    return con;
}
async function getDBQuery(connection, requestQuery) {
 await   connection.connect(function (err) {
        if (err) throw err;
        

        connection.query(requestQuery, async function (error, result) {
            console.log(result);
           
            if (error)throw error;
             
        });
       
   connection.end();  
  });
}
 async function getDataFromDB(DB_details, requestQuery) {
   await DB_details.connect( function (err) {
        if (err) throw err;
        DB_details.query(requestQuery, function (err, result) {
            if (err) throw err;
            console.log("=================================================================");
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
            console.log("=================================================================");
        });
        DB_details.end();
    });
}

// const DB_details = getDbConnection(process.env.DB_HOST, process.env.DB_USER_NAME, process.env.DB_PASSWORD, "todo");
// getDataFromDB(DB_details, "select * from todos;");
// new_todo = readline.question("Todo Title to add todo : ");
// getDBQuery(DB_details, `insert into todos(todo) value("new_todo");`);
// new_todo = readline.question("Todo Title to add todo : ");
// console.log(`insert into todos(todo) value("${new_todo}");`);
// const DB_details = getDbConnection(process.env.DB_HOST, process.env.DB_USER_NAME, process.env.DB_PASSWORD, "todo");
// getDBQuery(DB_details, `insert into todos(todo) value("${new_todo}");`);

 async function listTodo() {
    console.log("List");
  const DB_details = await getDbConnection(process.env.DB_HOST, process.env.DB_USER_NAME, process.env.DB_PASSWORD, "todo");
   await getDataFromDB(DB_details, "select * from todos;");
    console.log("List");
}
function addTodo() {
    new_todo = readline.question("Todo Title to add todo : ");
    console.log(`insert into todos(todo) value("${new_todo}");`);
    const DB_details = getDbConnection(process.env.DB_HOST, process.env.DB_USER_NAME, process.env.DB_PASSWORD, "todo");
    getDBQuery(DB_details, `insert into todos(todo) value("${new_todo}");`);
}
function deleteTodo() {
    console.log("Delete");
    const DB_details = getDbConnection(process.env.DB_HOST, process.env.DB_USER_NAME, process.env.DB_PASSWORD, "todo");
   // getDataFromDB(DB_details, "select * from todos;");
    new_todo = readline.question("Todo Title to delete: ");

    getDBQuery(DB_details, `DELETE FROM todos WHERE todo = '${new_todo}';`);
  //  getDataFromDB(DB_details, "select * from todos;");
}//

// listTodo();
module.exports = { listTodo, addTodo, deleteTodo, getDbConnection, getDBQuery, getDataFromDB };