if __name__ == "__main__":
    
    
    L = ["Dummy lines\n", "oo asas jef lasslakas\n", "paosask jn aslas\n"] 
      
    # writing to file 
    file1 = open('myfile.txt', 'w') 
    file1.writelines(L) 
    file1.close() 
      
    # Using readlines() 
    file1 = open('myfile.txt', 'r') 
    lines = file1.readlines() 
      
    
    mx=0
    
    for line in lines: 
        if len(line)>mx:
            mx=len(line)
    mx-=1
    
    ans=[]
    for line in lines:
        rem = mx-len(line)+1
        count = len(line.split())
        
        per = rem//(count-1)
        per2 = rem % (count-1)
        st=""
        words = line.split()
        for word in words:
            st+=word
            st+=' '
            for i in range(per):
                st+=' '
            if per2>0:
                st+=' '
                per2-=1
        st.strip()
        st+='\n'
        ans.append(st)
    
    file1.close()
    
    file2 = open('mynewfile.txt', 'w') 
    file2.writelines(ans) 
    file2.close()
    
    file2 = open('mynewfile.txt', 'r') 
    lines = file2.readlines() 
    
    for line in lines: 
        print(line.strip()) 
    
