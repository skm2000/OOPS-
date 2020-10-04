class MyString:
    def __init__(self,s):
        self.str=s
    def __len__(self):
        length=len(self.str)
        words=list(self.str.split())
        freq = {} 
        for item in words: 
            if item in freq: 
                freq[item] += 1
            else: 
                freq[item] = 1
        for key,value in freq.items():
            if value>1:
                print("{0} : {1}".format(key,len(key)))
        return length
    def most_common(self):
        words=list(self.str.split())
        freq = {} 
        for item in words: 
            if item in freq: 
                freq[item] += 1
            else: 
                freq[item] = 1
        ans,f="",-1
        for key,value in freq.items():
            if value>f:
                f,ans=value,key
        return ans

myString = MyString('Hello i am a geeks for geeks follower')
print(len(myString))
print(myString.most_common())
