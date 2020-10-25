package it.unical.inf.asd.jpa.entity.inheritance.mappedsuperclass;

import javax.persistence.Entity;

@Entity
class Motorcycle extends Vehicle {

    private boolean hasSideCar;

    public boolean hasSideCar() {
        return hasSideCar;
    }
}
