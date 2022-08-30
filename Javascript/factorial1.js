let i = parseInt(prompt(" Enter a number to check factorial"));
let fac;
if (i < 0) {
  document.write("Please enter +value");
} else if (i == 0) {
  document.write("The value is 1");
} else if (i == 1) {
  document.write("The value is 1");
} else {
  for (let c = i; c > 0; c--) {
    fac = fac * c;
  }
  document.write("The value is :", fac);
}
