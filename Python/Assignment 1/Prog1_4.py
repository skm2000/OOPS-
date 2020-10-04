from itertools import permutations
 
def printPermutation(word):
   p = permutations(word)
   for i in list(p):
       str = ""
       str = str.join(i)
       print(str)

if __name__ == "__main__":
    word = "ABCD"
    newWord = list(word) # just because strings are immutable in python
    n = len(word)
    printPermutation(newWord)
