from account import Account

class User(Account):
    def __init__(self, id_, name, document, email, password):
        
        super().__init__(id_, name, document, email, password)