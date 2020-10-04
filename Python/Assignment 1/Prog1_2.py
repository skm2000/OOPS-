
myDict = {
    "sunday" : 10,
    "monday" : 15,
    "tuesday" : 5,
    "wednesday" : 55,
    "thursday" : 34.75,
    "friday" : 21,
    "saturday" : 100
}


if __name__ == "__main__":

    day = str(input("Enter the day of the week: "))
    day = day.lower()
    if day in myDict.keys():
        print("OMG! You got {}% discount!\n Happy Shopping :)".format(myDict[day]))
    else:
        print("I am not sure this day exists!:( \nTry again!!!")