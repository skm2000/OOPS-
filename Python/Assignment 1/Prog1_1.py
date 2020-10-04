def primeGenerator(n):

    # this function will generate primes upto n
    i = 2
    prime = []
    while i <= n:
        if isPrime(i,prime):
            prime.append(i)
        if(i%2 == 0): i+=1
        else: i += 2
    
    print(prime)


def isPrime(n, prime):
    if not len(prime):
        #this is only the case when the number is 2
        return True
    else:
        for i in prime:
            # checking if the current number is divisable by already
            # found primes or not
            if n%i == 0:
                return False
    
    # true returned if the number is not divisable by any of these number
    return True


if __name__ == "__main__":

    n = int(input("Enter a number: "))
    print("Prime Numbers less than or equal to {}:".format(n))
    primeGenerator(n)