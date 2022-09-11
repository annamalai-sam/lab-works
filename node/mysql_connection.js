var mysql = require('mysql2');

var con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "AnnaMalai@19"
});

con.connect((err) => {
    if (err) throw err;
    console.log("Connected!");
    // con.query("CREATE DATABASE node_js", function (err, result) {
    // con.query("Drop database node_js", function (err, result) {
    let datum = con.query("show databases", function (err, result) {
        if (err) throw err;
        console.log("===========================");
        console.log(result[1].Database);
    });
    con.end();
    console.log("==========================");
    console.log(datum);
});
