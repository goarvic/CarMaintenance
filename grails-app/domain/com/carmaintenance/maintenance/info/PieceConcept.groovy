package com.carmaintenance.maintenance.info


class PieceConcept {


    String units
    float totalUnits
    String name
    String description
    float prizeNoTax


    static belongsTo = [garageVisit: GarageVisit]


    static constraints = {
    }
}
