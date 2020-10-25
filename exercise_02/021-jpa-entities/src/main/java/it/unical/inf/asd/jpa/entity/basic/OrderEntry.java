package it.unical.inf.asd.jpa.entity.basic;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ORDER_TABLE")
public class OrderEntry {
 
    @EmbeddedId
    private OrderEntryPK entryId;
 
    // ...
}