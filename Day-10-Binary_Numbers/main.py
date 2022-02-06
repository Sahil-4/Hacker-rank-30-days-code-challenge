#!/bin/python3

import math
import os
import random
import re
import sys


def toBinary(n):
    Binary = ""
    # logic to convert decimal to binary
    if n > 1:
        while n > 0:
            Binary = str(n % 2) + Binary
            n = int(n/2)
        return Binary
    return n


def countN(binary):
    count = 0
    maxCount = 0
    # count consecutive 1s in Binary
    for i in range(len(binary)):
        if binary[i] == '1':
            count += 1
            maxCount = max(count, maxCount)
        else:
            count = 0

    return maxCount


if __name__ == '__main__':
    n = int(input().strip())
    binary = toBinary(n)
    count = countN(binary)
    print(count)
