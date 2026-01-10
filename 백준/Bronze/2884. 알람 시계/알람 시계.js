const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().split(' ');

let hour = Number(input[0]);
let min = Number(input[1]);

if (min < 45) {
    if (hour == 0) {
        hour = 23;
    } else {
        hour -= 1;
    }

    min = (min - 45) + 60;
} else {
    min -= 45;
}

console.log(hour + " " + min);