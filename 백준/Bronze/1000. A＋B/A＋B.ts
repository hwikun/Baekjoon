import fs = require('fs')
var input = fs.readFileSync('/dev/stdin').toString().split(' ');
const [a, b] = input;

console.log(parseInt(a) + parseInt(b))