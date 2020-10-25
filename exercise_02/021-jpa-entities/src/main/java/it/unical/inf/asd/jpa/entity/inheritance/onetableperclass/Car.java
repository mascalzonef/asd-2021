package it.unical.inf.asd.jpa.entity.inheritance.onetableperclass;

import javax.persistence.Entity;

@Entity
class Car extends Vehicle {
    private boolean runOnLpg;

    public boolean runOnLpg() {
        return runOnLpg;
    }
}
