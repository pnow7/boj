const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split(/\s+/);

const T = Number(input[0]);

let result = "";
for (let i = 1; i <= T; i++) {
    let R = Number(input[2 * (i - 1) + 1]);
    let P = input[2 * (i - 1) + 2];

    for (let j = 0; j < P.length; j++) {
        let s = P.charAt(j);

        for (let k = 0; k < R; k++) {
            result += s;
        }
    }

    result += "\n";
}

console.log(result);