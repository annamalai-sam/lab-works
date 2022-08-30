let mon = [
  "jan",
  "feb",
  "mar",
  "apr",
  "may",
  "jun",
  "jul",
  "aug",
  "sep",
  "oct",
  "nov",
  "dec",
];
/*document.write(
  mon.indexOf(check) =! -1
  );*/
document.write(mon);
let check = prompt("Enter the value to check");
console.log(check);
if (mon.includes(check)) {
  console.log("Array contains a value.");
} else {
  console.log("Array does not contain a value.");
}
