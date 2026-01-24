const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split(/\s+/);

const submitted = Array(31).fill(false);
const arr = input.slice(0).map(Number);

for (let i = 0; i < arr.length; i++) {
    submitted[arr[i]] = true;
}

let result = [];
for (let i = 1; i < submitted.length; i++) {
    if (submitted[i] === false) {
        result.push(i);
    }
}

console.log(result.join("\n"));