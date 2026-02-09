const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().toUpperCase().split("");
const check = Array(26).fill(0);

input.forEach((alpha) => { const alphaIdx = alpha.charCodeAt(0) - 65; check[alphaIdx]++; });

const maxCount = Math.max(...check);
const maxCountIdx = check.indexOf(maxCount) + 65;
const maxCountAlpha = String.fromCharCode(maxCountIdx);
const alphaCheck = check.filter(val => val === maxCount);

console.log(alphaCheck.length > 1 ? "?" : maxCountAlpha);