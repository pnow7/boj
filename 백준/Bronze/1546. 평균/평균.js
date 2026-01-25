const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split(/\s+/).map(Number);

const N = Number(input[0]);
const arr = input.slice(1);
const maxVal = Math.max(...arr);

const sum = arr.reduce((acc, cur) => acc + cur);
const result = (sum / maxVal * 100) / N;

console.log(`${result}`);