const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split(/\s+/);

let result = "";
let maxLength = Math.max(...input.map(str => str.length));

for (let i = 0; i < maxLength; i++) {
    for (let j = 0; j < input.length; j++) {
        if (input[j][i]) {
            result += input[j][i];
        }
    }
}

console.log(result);