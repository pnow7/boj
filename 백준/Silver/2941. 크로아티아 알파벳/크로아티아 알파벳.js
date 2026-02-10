const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim();
const croatia = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="];

let result = input;
for (const ch of croatia) {
    result = result.split(ch).join("X");
}

console.log(result.length);