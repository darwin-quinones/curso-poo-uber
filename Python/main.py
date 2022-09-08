from car import Car
from account import Account
from uberBlack import UberBlack
from driver import Driver
from user import User


def run():
    # car = Car()
    # car.license = "tqm123"
    # car.driver = "Darwin"
    # car.passenger = 5
    # print(vars(car))

    # car2 = Car()
    # car2.license = "tqm123"
    # car2.driver = "Pepito"
    # car2.passenger = 10
    # print(vars(car2))

    car = Car("ADM120", Account(3, "Darwin Q", "100074987", "darwin@gmail.com", "1245"))
    print(vars(car))
    print(vars(car.driver))

    # uberBlack = UberBlack("ATP2", Account("Darwin Q", "100074987"), "P", "Cuero")
    # print(vars(uberBlack))
    
    
    driver = Driver(2, "Darwin", "10072342343", "darwin@gmail.com", "7847")
    print("Driver")
    print(vars(driver))
    
    user = User(1, "Pepe", "10072344223", "pepe@gmail.com", "1289")
    print("User")
    print(vars(user))
    
    

if __name__ == "__main__":
    run()








