#!/bin/python3

if __name__ == '__main__':
    arr = []
    Max = 0

    for _ in range(6):
        arr.append(list(map(int, input().rstrip().split())))

    for row in range(4):
        for col in range(4):
            sum = arr[row][col] + arr[row][col + 1] + arr[row][col + 2] + arr[row +
                                                                              1][col + 1] + arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2]
            if sum <= Max:
                Max = sum

    for row in range(4):
        for col in range(4):
            sum = arr[row][col] + arr[row][col + 1] + arr[row][col + 2] + arr[row +
                                                                              1][col + 1] + arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2]
            if sum >= Max:
                Max = sum

    print(Max)
