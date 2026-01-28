const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim();

const result = Array(26).fill(-1);

for (let i = 0; i < input.length; i++) {
    const idx = input.charCodeAt(i) - 97;

    if (result[idx] === -1) {
        result[idx] = i;
    }
}

console.log(result.join(' '));