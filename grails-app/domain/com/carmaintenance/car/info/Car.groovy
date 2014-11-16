package com.carmaintenance.car.info

import com.carmaintenance.fuel.info.FuelLoad
import com.carmaintenance.maintenance.info.GarageVisit

class Car {


    CarModel carModel

    static hasMany = [fuelLoads: FuelLoad, garageVisits : GarageVisit]


    static constraints = {
        carModel nullable : false
    }
}
