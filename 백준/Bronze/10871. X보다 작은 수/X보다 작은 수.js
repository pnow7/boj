const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split(/\s+/);

const N = Number(input[0]);
const X = Number(input[1]);
const arr = input.slice(2).map(Number);
const result = arr.filter(val => val < X).join(" ");

console.log(result);