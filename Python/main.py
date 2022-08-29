from car import Car

def run():
    car = Car()
    car.license = "tqm123"
    car.driver = "Darwin"
    car.passenger = 5
    print(vars(car))

    car2 = Car()
    car2.license = "tqm123"
    car2.driver = "Pepito"
    car2.passenger = 10
    print(vars(car2))

if __name__ == "__main__":
    run()








