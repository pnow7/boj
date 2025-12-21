const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split('\n');

const T = Number(input[0]);
const regex = /^[A-F]?A+F+C+[A-F]?$/;

for (let i = 1; i <= T; i++) {
    const chromosome = input[i];

    if (regex.test(chromosome)) {
        console.log("Infected!");
    } else {
        console.log("Good");
    }
}