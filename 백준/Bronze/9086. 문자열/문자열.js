const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split(/\s+/);

const T = Number(input[0]);

let result = "";
for (let i = 1; i <= T; i++) {
    let string = input[i];
    result += string.charAt(0) + string.charAt(string.length - 1) + "\n";
}

console.log(result);