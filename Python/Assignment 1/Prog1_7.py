

def mySort(**kwargs):
    # this function sorts a list of integers
    myList = []
    sortType = False # False for ascending order sorting
    count = 0
    for key, value in kwargs.items():
        if count == 0: 
            myList = value
            count += 1
        else: sortType = value
    
    n = len(myList)
    #simple bubble sort
    for i in range(n-1):
        for j in range(0, n-i-1):
            if myList[j] > myList[j+1]:
                myList[j], myList[j+1] = myList[j+1],myList[j]

    # reverse the string if the sortType bit is set
    if sortType: myList.reverse()
    if sortType: print("sorted in descending order: ")
    else: print("Sorted in ascending order: ")
    print(myList)


if __name__ == "__main__":

    myList = []
    n = int (input("Enter a number: "))
    print("Enter {} number(s): ".format(n))

    for i in range(0,n):
        x = int(input())
        myList.append(x)

    kwargs = {"list":myList, "type": True}
   
    mySort(**kwargs)

