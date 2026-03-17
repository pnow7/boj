const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split(/\s+/);
const matrix = input.slice(0, 9 * 9);

let index = 0;
let max = 0;
let row = 0;
let col = 0;
for (let i = 0; i < 9; i++) {
    for (let j = 0; j < 9; j++) {
        const val = Number(matrix[index++]);

        if (val >= max) {
            max = val;
            row = i + 1;
            col = j + 1;
        }
    }
}

console.log(max);
console.log(row, col);