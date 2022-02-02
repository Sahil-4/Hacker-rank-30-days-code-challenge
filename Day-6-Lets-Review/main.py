# Enter your code here. Read input from STDIN. Print output to STDOUT 

test_cases = int(input())

for _ in range(test_cases):
    even_str = ""
    odd_str = ""

    str = input("")
    for i in range(len(str)):
        if i % 2 == 0:
            even_str += str[i]
        else:
            odd_str += str[i]

    print(even_str, odd_str)
