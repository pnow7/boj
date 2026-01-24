const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split(/\s+/);
const arr = input.slice(0).map(Number);

let idx = 0;
let maxValue = 0;
for (let i = 0; i < arr.length; i++) {
    if (arr[i] > maxValue) {
        maxValue = arr[i];
        idx = i;
    }
}

console.log(`${arr[idx]}\n${idx + 1}`);