const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split(/\s+/);

let idx = 0;
const N = Number(input[idx++]);
const X = Number(input[idx++]);

const arr = [];
for (let i = 0; i < N; i++) {
    arr.push(Number(input[idx++]));
}

const arrRtn = [];
for (let i = 0; i < arr.length; i++) {
    if (arr[i] < X) {
        arrRtn.push(arr[i]);
    }
}

let result = "";
for (let i = 0; i < arrRtn.length; i++) {
    result += arrRtn[i] + " ";
}

console.log(result);