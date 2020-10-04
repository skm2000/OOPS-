if __name__ == "__main__":
    
    
    L = ["Dummy lines\n", "oo asas jef lasslakas\n", "paosask jn aslas\n"] 
      
    # writing to file 
    file1 = open('myfile.txt', 'w') 
    file1.writelines(L) 
    file1.close() 
      
    # Using readlines() 
    file1 = open('myfile.txt', 'r') 
    lines = file1.readlines() 
      
    
    dic={}
    count=0
    
    for line in lines: 
        words = line.strip().split()
        for word in words:
            if word not in dic:
                dic[word]=count
                count+=1
            
    print(dic) 
    
