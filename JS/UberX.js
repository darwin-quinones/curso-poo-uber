class UberX extends Car{
    constructor(license, driver, brand, model){
        super(license, driver)
        this.brand = brand
        this.model = model
       
    }
    printDataUberX =  () => {
        console.log(this.model)
        console.log(this.brand)
    }
    
}