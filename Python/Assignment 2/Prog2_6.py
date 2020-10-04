# parent class :: book
class book:
    def __init__(self, title, pub):
        self.title = title
        self.pub = pub
    
    def show_det(self) :
        print("Is Book")
        print(self.title, " ", self.pub)

# child class of 'book' :: ebook
# ebook has an additional attr. :: page
class ebook(book):
    def __init__(self, title, pub, page):
        super().__init__(title, pub)
        self.page = page
    
    def show_det(self):
        print("Is EBook")
        print(self.title, " ",self.pub, " ",self.page)

# child class of 'book' :: journal
# journal has an additional attr. :: page
class journal(book):
    def __init__(self, title, pub, page):
        super().__init__(title, pub)
        self.page = page
    
    def show_det(self):
        print("Is Journal")
        print(self.title, " ",self.pub, " ",self.page)   


# Creating the classes and using them
new_book = book("Fault in our Stars", "John Green")
new_book.show_det()

print("-----------")

new_ebook = ebook("Stormlight Archive", "Sanderson", 100)
new_ebook.show_det()

print("-----------")

new_journal = journal("ACM-Programming Languages", "Springer", 3)
new_journal.show_det()