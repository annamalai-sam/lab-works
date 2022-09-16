const fs = require('fs')
let content = "console.log('Hello World');"
fs.appendFile("note.js", content, function (err) {
    if (err) throw err
    console.log("Saved")
})
