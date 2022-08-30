let frt_mon = ["jan", "feb", "mar", "apr", "may", "jun", "nov", "jul"];
let sec_mon = ["Aug", "apr", "sep", "oct", "nov", "dec", "jan", "feb"];
// console.log(intersection(...frt_mon, ...sec_mon));
let same = [...frt_mon, ...sec_mon];
let common = new IntersectionObserver(same);
console.log(common);
