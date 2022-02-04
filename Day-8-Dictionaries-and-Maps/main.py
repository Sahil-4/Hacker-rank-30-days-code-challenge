# Enter your code here. Read input from STDIN. Print output to STDOUT

test_cases = int(input())
phone_book = {}

# Create phonebook
for _ in range(test_cases):
    name = input("")
    phone_book[name] = input()

# find names in phonebook 
for _ in range(test_cases):
    query = input("")
    if query in phone_book:
        print(f"{query} = {phone_book[query]}")
    else:
        print("Not found")
