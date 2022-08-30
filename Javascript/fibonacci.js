let first = 0;
let second = 1;
let nxt;
let num = prompt("Enter a postive number:");
if (num <= 1) {
  document.write("Please Enter a +ve number");
} else {
  for (let i = 1; i <= num; i++) {
    document.write("<br>", first);
    nxt = first + second;
    first = second;
    second = nxt;
  }
}
