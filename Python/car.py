from sqlalchemy import null
from account import Account

class Car:
    id = int
    license = str
    driver = Account(null, "", "", "", "")
    passenger = int


    def __init__(self, license, driver) :
        self.license = license
        self.driver = driver  


