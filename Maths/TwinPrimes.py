import math
import itertools

def isprime(n):
    if n < 2:
        return False
    return all(n % i for i in range(2, int(math.sqrt(n)) + 1))

def yield_twin_pairs(m):
    print 3, 5
    for i in itertools.count(5, 6):
        if i>=m:
            break
        if isprime(i) and isprime(i+2):
            print i, i+2

m=input();
yield_twin_pairs(m)