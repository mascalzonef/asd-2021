package it.unical.inf.asd.jpa.entity.inheritance.mappedsuperclass;

import javax.persistence.Entity;

//In the database, this will correspond to only two tables
@Entity
class Car extends Vehicle {

    private boolean runOnLpg;

    public boolean runOnLpg() {
        return runOnLpg;
    }
}
