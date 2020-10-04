import numpy as np

# Creating a list with random integers
l = [np.random.randint(-20, 11) for x in range(15)] 

# Displaying a list with random integers
print(l)

# Storing frequency of integers
freq = {}

for x in l:
    if x in freq:
        freq[x] += 1
    else :
        freq[x] = 1

# Finding the element with max frequency
kf, vf = l[0], freq[l[0]]

for k, v in freq.items():
    if v > vf:
        kf  = k

# Printing the element with max freq.
print(kf)