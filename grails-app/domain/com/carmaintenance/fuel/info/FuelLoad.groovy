package com.carmaintenance.fuel.info

import com.carmaintenance.car.info.Car

class FuelLoad {

    static belongsTo = [car: Car]

    static constraints = {
    }
}
