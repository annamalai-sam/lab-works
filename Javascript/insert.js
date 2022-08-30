let mon = [
  "jan",
  "feb",
  "mar",
  "apr",
  "may",
  "jun",
  "jul",
  "Aug",
  "sep",
  "oct",
  "nov",
  "dec",
];
document.write(mon);
let int = prompt("Enter the index value to Insert");
mon.push(int);
mon.unshift(int);
console.log(mon);
