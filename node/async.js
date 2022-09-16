function myFunction() {
    var x = 10;
    var y = 50;
    console.log("x value is " + x);
    var t = 0;
    setTimeout(function () {
        console.log("This is set timeout function");
        t = 30;
        console.log(t);
    }, 5000);
    console.log("Y value is " + y);
    console.log(t);
}