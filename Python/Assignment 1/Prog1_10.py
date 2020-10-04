if __name__ == "__main__":
    
    
    #Printing odd squares upto 10000
    
    ans = list(map( lambda x:x**2 , filter(lambda y:y%2==1,range(100))))
    print(ans)
