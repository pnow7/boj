const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split(/\s+/);

let idx = 0;
const N = Number(input[idx++]);

let arr = [];
for (let i = 0; i < N; i++) {
    arr.push(Number(input[idx++]));
}

let count = 0;
const target = Number(input[idx++]);
for (let i = 0; i < N; i++) {
    if (arr[i] === target) count++;
}

console.log(count);