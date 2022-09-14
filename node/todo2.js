const readline = require("readline-sync");
// let todo = require("./main");
const mysql = require('mysql2');
require('dotenv').config({ path: './../.env' });

function getDbConnection(host, userName, password, db_name) {
    var con = mysql.createConnection({
        host: host,
        user: userName,
        password: password,
        database: db_name
    });
    return con;
}
function getDataFromDB(connection, requestQuery) {
    connection.connect(function (err) {
        if (err) throw err;
        connection.query(requestQuery, function (err, result) {
            if (err) throw err;
            console.log("=================================");
            console.log(result);
            console.log("=================================");
        });
        connection.end();
    });
    return "Test"
}

const DB_details = getDbConnection(process.env.DB_HOST, process.env.DB_USER_NAME, process.env.DB_PASSWORD, "todo");
let valueFromDB = getDataFromDB(DB_details, "Show Databases");
console.log("=================================");
console.log("Outer");
console.log(valueFromDB);
console.log("=================================");





















// function kickOffTodo() {
//     let startCommand = readline.question("press 'L' to list todo, press 'N' to create new todo,press 'D' to delete the todo, press 'END' to end the app : ");
//     console.log(startCommand);

//     // if (startCommand == "L") {
//     //     getDataFromDB();
//     //     kickOffTodo();
//     // }
//     // else if (startCommand == "N") {
//     //     getDataFromDB();
//     //     addValueToDB();
//     //     getDataFromDB();
//     //     kickOffTodo();
//     // }
//     // else if (startCommand == "D") {
//     //     getDataFromDB();
//     //     deleteValueFromDB();
//     //     getDataFromDB();
//     //     kickOffTodo();
//     // }
//     // else if (startCommand == "END") {

//     // }
//     // else {

//     // }
//     // switch (startCommand) {
//     //     case "L":
//     //         getDataFromDB();
//     //         kickOffTodo();
//     //         break;
//     //     case "N":
//     //         getDataFromDB();
//     //         addValueToDB();
//     //         getDataFromDB();
//     //         kickOffTodo();
//     //         break;
//     //     case "D":
//     //         getDataFromDB();
//     //         deleteValueFromDB();
//     //         getDataFromDB();
//     //         kickOffTodo();
//     //         break;
//     //     case "End":
//     //         break;
//     // }
// }
// kickOffTodo();