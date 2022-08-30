let frt_mon = ["jan", "feb", "mar", "apr", "may", "jun", "apr", "jul"];
let sec_mon = ["Aug", "apr", "sep", "oct", "nov", "dec", "jan", "feb"];
let mon = [...frt_mon, ...sec_mon];
let cormon = [...new Set(mon)];
console.log(cormon);
