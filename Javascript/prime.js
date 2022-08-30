let p = prompt(" Enter a number to check prime");
let c;
for (let t = 2; t < p; t++) {
  c = p % t;
  if (c === 0) {
    break;
  }
}
if (c === 0) {
  document.write("<br>The number is not a prime");
} else {
  document.write("<br>The number is a prime");
}
