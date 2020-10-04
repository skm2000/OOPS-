'''

@author: < add your name here >
'''
from tkinter import *
from quiz import Quiz

class Controller:
    ''' Drive an interactive quiz GUI '''
    
    def __init__(self, window):
        ''' Create a quiz and GUI frontend for that quiz '''
        
        self.quiz = Quiz()
        
        self.question_text = Text(window, font="arial 16", width = 40, height = 4, wrap = WORD)
        self.question_text.insert(1.0, self.quiz.ask_current_question())
        self.question_text.pack()
        
        self.answer = StringVar()
        self.answerEntry = Entry (window, textvariable = self.answer)
        self.answerEntry.pack(side = LEFT)
        self.answerEntry.focus_set()
        self.answerEntry.bind("<Return>", self.check_answer)
        
        self.instructions = StringVar()
        self.instructions.set('\u21D0 Enter your answer here')
        self.instrLabel = Label(window, textvariable = self.instructions)
        self.instrLabel.pack(side = LEFT)
        
    def check_answer(self, event):
        ''' Check if the user's current answer is correct '''
        
        if self.quiz.check_current_answer(self.answer.get()):
            #Got it right!!
            self.instructions.set("Good job!  Next question ...")
        else:
            self.instructions.set("Sorry, the answer was " + self.quiz.get_current_answer()) 
        self.answer.set('')
        
        #Go to the next question if it exists
        self.question_text.delete(1.0, END)  
        if (self.quiz.has_next()):
            self.quiz.next()
            self.question_text.insert(1.0, self.quiz.ask_current_question())
        else:  
            self.question_text.insert(1.0, 'Sorry, there are no more questions.')
            self.answerEntry.configure(state='disabled')
   

if __name__ == '__main__':
    root = Tk()
    root.title('Simple Quiz')    
    app = Controller(root)
    root.mainloop()
