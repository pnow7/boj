const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split(/\s+/);
const A = Number(input.shift().split("").reverse().join(""));
const B = Number(input.shift().split("").reverse().join(""));

console.log(A > B ? A : B);