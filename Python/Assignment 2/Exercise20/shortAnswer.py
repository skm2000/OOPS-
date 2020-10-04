'''
Advanced OOPs

@author: <Put Your Name Here>
'''
from problem import Problem

class ShortAnswer(Problem):
    ''' Model a short-answer question '''
    
    def __init__(self, q, a):
        ''' Construct a short-answer question with question and answer texts '''
        super().__init__(q)
        self.answer = a
              
    def ask_question(self):
        ''' Return the question text '''
        return self.get_text() + '?'
    
    def check_answer(self, a):
        ''' Return True if a is the correct answer; False otherwise '''
        return self.answer == a
    
    def get_answer(self):
        ''' Return the answer text '''
        return self.answer

   
class FillInTheBlank(ShortAnswer):
    ''' Model a Fill in the Blank question '''

    ''' Overrided Function from ShortAnswer parent with necessary Modification'''
    def ask_question(self):
        ''' Return the question text with necessary Instruction '''
        return self.get_text() + '\nFill in the blank.'


class TrueFalse(ShortAnswer):
    ''' Model a True False question '''

    ''' Overrided Constructor from ShortAnswer parent with answer type checking '''
    def __init__(self, q, a):
        if not isinstance(a, bool):
            raise TypeError("Answer is expected of type bool")
        
        #Calling constructor of parent class with suitable arguements
        super().__init__(q, a)
    
    ''' Overrided Function from ShortAnswer parent with Modified question'''
    def ask_question(self):
        ''' Return the question text with necessary Instruction '''
        return self.get_text() + '\nIs this statement true or false?'

    ''' Overrided Function from ShortAnswer parent '''
    def get_answer(self):
        ''' Return the answer in string '''
        return str(self.answer)
    
    ''' Overrided Function from ShortAnswer parent '''
    def check_answer(self, a):
        ''' Return True if a (in title case) is the correct answer; False otherwise '''
        return str(self.answer) == a.title()


if __name__ == "__main__":
    q = ShortAnswer('question', 'answer')
    assert q.get_text() == 'question'
    assert q.get_answer() == 'answer'
    assert q.ask_question() == 'question?'
    assert not (q.check_answer('ans'))
    assert q.check_answer('answer')

    q = FillInTheBlank('question', 'answer')
    assert q.get_text() == 'question'
    assert q.get_answer() == 'answer'
    assert q.ask_question() == 'question\nFill in the blank.'
    assert not (q.check_answer('ans'))
    assert q.check_answer('answer')

    q = TrueFalse('question', False)
    assert q.get_text() == 'question'
    assert q.get_answer() == 'False'
    assert q.ask_question() == 'question\nIs this statement true or false?'
    
    assert not (q.check_answer('random_ans'))
    assert q.check_answer('False')
    assert q.check_answer('false')

    print('All ShortAnswer tests passed!')
