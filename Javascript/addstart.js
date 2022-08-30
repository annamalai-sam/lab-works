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
document.write(mon);
let check = prompt("Enter the value to insert");
mon.unshift(check);
document.write("<br>", mon);
// mon.splice(0, 0, "two_jan", "two_feb", "two_mar");
// console.log(mon);
// document.write("<br>", mon);
