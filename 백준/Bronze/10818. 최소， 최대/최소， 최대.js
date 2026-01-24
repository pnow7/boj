const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split(/\s+/);

const N = Number(input[0]);
const arr = input.slice(1).map(Number);

const min = Math.min(...arr);
const max = Math.max(...arr);

console.log(`${min} ${max}`)