let mon = [
  "jan",
  "feb",
  "mar",
  "apr",
  "may",
  "jun",
  "apr",
  "jul",
  "Aug",
  "apr",
  "sep",
  "oct",
  "nov",
  "dec",
  "jan",
  "feb",
];
document.write(mon);
let cormon = [...new Set(mon)];
// let crmon = new Set(mon);
console.log(cormon);
