var mysql = require('mysql2');
require('dotenv').config({ path: '../.env' });

function createConnection() {
  var con = mysql.createConnection({
    host: process.env.DB_HOST,
    user: process.env.DB_USER_NAME,
    password: process.env.DB_PASSWORD
  });
  con.connect((err) => {
    if (err) throw err;
    console.log("Connected!");
  })
  return con
}

// con.connect((err) => {
//     if (err) throw err;
//     console.log("Connected!");
//     // con.query("CREATE DATABASE node_js", function (err, result) {
//     // con.query("Drop database node_js", function (err, result) {
//     let datum = con.query("show databases", function (err, result) {
//         if (err) throw err;
//         console.log("===========================");
//         console.log(result[1].Database);
//         result.forEach(element => {
//             console.log(element.Database);
//         });
//     });
//     con.end();
//     console.log("==========================");
//     console.log(datum);
// });

async function queryLoader(query, connectionObject) {
  
  console.log(query)
  const data =  connectionObject.query(query)
  console.log(data)
}
let connectionObject = createConnection()
queryLoader("show databases", connectionObject)