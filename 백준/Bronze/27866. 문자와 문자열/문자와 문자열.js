const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split(/\s+/);

const S = input[0];
const i = Number(input[1]);

console.log(`${S[i - 1]}`);