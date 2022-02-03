function processData(input) {
    //Enter your code here
    // console.log(input.split("\n"));
    let test_cases = input.split("\n")[0];
    const words = [];

    for (let i = 1; i < input.split("\n").length; i++) {
        words.push(input.split("\n")[i]);
    }

    words.forEach((w) => {
        let even_chars = "", odd_chars = "";
        let char_arr = w.split("");

        for (let i = 0; i < char_arr.length; i++) {
            if (i % 2 == 0) {
                even_chars += char_arr[i];
            } else {
                odd_chars += char_arr[i];
            }
        }
        
        console.log(even_chars, odd_chars);
    })
}

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
    processData(_input);
});
