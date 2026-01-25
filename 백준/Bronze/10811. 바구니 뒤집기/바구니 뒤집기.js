const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split(/\s+/).map(Number);

const [N, M] = input;
const arr = Array.from({ length: N }, (_, i) => i + 1);

for (let i = 0; i < M; i++) {
    let start = Number(input[2 * (i + 1)]) - 1;
    let end = Number(input[2 * (i + 1) + 1]) - 1;

    while(start < end) {
        [arr[start], arr[end]] = [arr[end], arr[start]];
        start++;
        end--;
    }
}

console.log(arr.join(" "));