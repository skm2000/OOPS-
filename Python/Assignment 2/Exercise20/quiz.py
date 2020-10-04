

from shortAnswer import ShortAnswer, TrueFalse, FillInTheBlank
import random

class Quiz:
    ''' Build a simple quiz game '''
    
    def __init__(self):
        ''' Construct a quiz object with a list of question objects '''
        
        self.problems = []
        self.problems.append(ShortAnswer('Where were the olympics held in 1956', 'Melbourne'))
        self.problems.append(ShortAnswer('What is the hottest recorded temperature in the United States', '134'))
        self.problems.append(ShortAnswer('Independence Day of India', '1947'))
        self.problems.append(TrueFalse('Sky is Blue', True))
        self.problems.append(FillInTheBlank('___ is the capital of India', 'New Delhi'))
        random.shuffle(self.problems)
        
        self.problemNum = 0
        
    def ask_current_question(self):
        ''' Return the text for the currently active question '''
        return self.problems[self.problemNum].ask_question()
    
    def get_current_answer(self):
        ''' Return the answer to the currently active question '''
        return self.problems[self.problemNum].get_answer()
    
    def check_current_answer(self, answer):
        ''' 
        Return True if answer is the answer to the currently active question, 
        False otherwise 
        '''
        return self.problems[self.problemNum].check_answer(answer)
    
    def has_next(self):
        ''' Return True if there are more questions; False otherwise '''
        return self.problemNum < len(self.problems) - 1
    
    def next(self):
        ''' Move on to the next question '''
        if self.problemNum == len(self.problems) - 1:
            raise Exception("There are no more problems")
        self.problemNum += 1
    
    
        
