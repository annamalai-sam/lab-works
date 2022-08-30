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
let i = parseInt(prompt("Enter the index value to remove"));
mon.splice(i, 1);
console.log(mon);
