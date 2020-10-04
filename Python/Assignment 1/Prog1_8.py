

if __name__ == "__main__":

    myList = []
    myDivisor =  lambda x,y: (x%y == 0) # generalized lambda function
    for i in range(1,51):
        if myDivisor(i,5):
            myList.append(i)
    
    print(myList)