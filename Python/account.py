class Account:
    id = int
    name = str
    document = str
    email = str
    password = str

    # metodo constructor en Python
    def __init__(self, name, document):
        self.name = name
        self.document = document
        
