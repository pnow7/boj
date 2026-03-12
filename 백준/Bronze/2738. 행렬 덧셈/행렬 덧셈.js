const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split(/\s+/);
const N = Number(input.shift());
const M = Number(input.shift());
const A = input.slice(0, N * M);
const B = input.slice(N * M, 2 * N * M);

for (let i = 0; i < N; i++) {
    let result = [];
    for (let j = 0; j < M; j++) {
        const index = i * M + j;
        const sum = Number(A[index]) + Number(B[index]);
        result.push(sum);
    }
    console.log(result.join(' '))
}