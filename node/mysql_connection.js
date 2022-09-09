var mysql = require('mysql2');

var con = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "AnnaMalai@19"
});

con.connect(function (err) {
    if (err) throw err;
    console.log("Connected!");
    // con.query("CREATE DATABASE node_js", function (err, result) {
    con.query("Drop database node_js", function (err, result) {
        if (err) throw err;
        console.log("===========================");
        console.log(result);
    });
    con.end();
});
