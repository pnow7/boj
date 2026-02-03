const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString().trim().split(/\s+/);
const words = input.filter(word => word != "");
console.log(words.length);