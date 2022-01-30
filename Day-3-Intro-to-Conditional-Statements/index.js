'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function(inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}

const solution = (n) => {
    if ((n % 2) || (n > 6 && n <= 20)) {
        console.log("Weird");
    } else {
        console.log("Not Weird");
    }
}

function main() {
    const N = parseInt(readLine().trim(), 10);
    solution(N);
}
