const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split(/\s+/);

const num = input[1].split("");
const sum = num.map(Number).reduce((acc, cur) => acc + cur, 0);

console.log(sum);