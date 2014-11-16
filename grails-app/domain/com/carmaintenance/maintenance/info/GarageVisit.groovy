package com.carmaintenance.maintenance.info

import com.carmaintenance.car.info.Car

class GarageVisit {

    static belongsTo = [car: Car]

    static hasMany = [concepts : PieceConcept]

    static constraints = {
    }
}
