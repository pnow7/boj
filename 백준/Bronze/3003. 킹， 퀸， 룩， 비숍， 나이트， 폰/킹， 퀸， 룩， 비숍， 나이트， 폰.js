const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split(/\s+/).map(Number);
const chess = [1, 1, 2, 2, 2, 8];

console.log(input.map((myPiece, i) => {
    return chess[i] - myPiece;
}).join(" "));