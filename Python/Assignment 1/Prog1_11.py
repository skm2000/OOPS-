if __name__ == "__main__":
    
    
    res = [(i,j,k) for i in range(1,10) for j in range(i,10) for k in range(j,20)] #Generating all triplets in the given range
    ans = list(filter(lambda x: x[0]*x[0] +x[1]*x[1]==x[2]*x[2] , res)) #Filtering the Pythagorean triplets
    print(ans)
