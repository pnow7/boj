const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim();

const result = Array(26).fill(-1);

input.split('').forEach((ch, i) => {
    const idx = ch.charCodeAt(0) - 97;
    if (result[idx] === -1) {
        result[idx] = i;
    }
})

console.log(result.join(' '));