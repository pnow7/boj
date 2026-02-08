const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split("").join("");
const input2 = [...input].reverse().join("");

console.log(input === input2 ? 1 : 0);