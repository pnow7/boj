const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split(/\s+/);
const num = input.slice(0).map(Number);

let result = [];
for (let i = 0; i < num.length; i++) {
    if (!result.includes(num[i] % 42)) {
        result.push(num[i] % 42);
    }
}

console.log(result.length);