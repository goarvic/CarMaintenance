package com.carmaintenance.car.info

class CarModel {

    String name
    Manufacturer manufacturer

    static constraints = {
        manufacturer nullable : false
    }
}
