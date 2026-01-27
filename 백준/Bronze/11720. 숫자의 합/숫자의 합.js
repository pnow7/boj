const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split(/\s+/)

const N = Number(input[0]);

let sum = 0;
for (let i = 1; i <= N; i++) {
    let num = Number(input[1].slice(i - 1, i));
    sum += num;
}

console.log(sum);