class Account:
    id_  = int
    name = str
    document = str
    email = str
    password = str

    # metodo constructor en Python
    def __init__(self, id_, name, document, email, password):
        self.id_ = id_
        self.name = name
        self.document = document
        self.email = email
        self.password = password
        
