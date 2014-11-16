package com.carmaintenance.fuel.info

import com.carmaintenance.car.info.Car

class FuelLoad {

    int litersVolume

    int carkilometers

    int totalPrize


    static belongsTo = [car: Car]

    static constraints = {
    }
}
