package it.unical.inf.asd.store.data.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("L")
class Lens extends Product {

}
