package com.carmaintenance.car.info

import com.carmaintenance.fuel.info.FuelLoad
import com.carmaintenance.maintenance.info.GarageVisit

class Car {

    Date dateCreated

    CarModel carModel

    Date dateVisit

    String invoiceImageFileName

    static hasMany = [fuelLoads: FuelLoad, garageVisits : GarageVisit]

    def beforeInsert() {
        dateCreated = new Date()
    }

    static constraints = {
        carModel nullable : false
        dateVisit nullable : false
        invoiceImageFileName nullable : true
    }
}
