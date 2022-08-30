from car import Car
from account import Account

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

    car = Car("ADM120", Account("Darwin Q", "100074987"))
    print(vars(car))
    print(vars(car.driver))

if __name__ == "__main__":
    run()








