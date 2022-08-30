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
let num = mon.length;
for (let i = 0; i < num; i++) {
  mon.shift();
}
console.log(mon);
