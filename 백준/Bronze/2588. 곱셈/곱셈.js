const fs = require('fs');
const [A, B] = fs.readFileSync("/dev/stdin").toString().trim().split('\n');

const numA = Number(A);
const numB = Number(B);

for (let i = 2; i >= 0; i--) {
    console.log(numA * Number(B[i]));
}

console.log(numA * numB);