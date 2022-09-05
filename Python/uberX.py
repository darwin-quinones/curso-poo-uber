from car import Car


# aplicando herencia en py
class UberX(Car):
    brand = str
    model = str

    def __init__(self, license, driver, brand, model):
        super().__init__(license, driver)
        self.model = model
        self.brand = brand