package com.carmaintenance.maintenance.info

import com.carmaintenance.car.info.Car

class GarageVisit {


    int carkilometers

    String description


    static belongsTo = [car: Car]

    static hasMany = [concepts : PieceConcept]


    static constraints = {
    }
}
