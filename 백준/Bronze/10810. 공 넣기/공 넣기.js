const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split(/\s+/);

const N = Number(input[0]);
const M = Number(input[1]);

const arr = [];
for (let i = 0; i < N; i++) {
    arr.push(0);
}

for (let i = 0; i < M; i++) {
    const first = Number(input[2 + (3 * i)]);
    const last = Number(input[3 + (3 * i)]);
    const ball = Number(input[4 + (3 * i)]);

    for (let j = first - 1; j < last; j++) {
        arr[j] = ball;
    }
}

let result = "";
for (let i = 0; i < arr.length; i++) {
    result += arr[i] + " ";
}

console.log(result);