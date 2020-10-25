package it.unical.inf.asd.jpa.entity.basic;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OrderEntryPK implements Serializable {
 
    private long orderId;
    private long productId;
 
    // standard constructor, getters, setters
    // equals() and hashCode() 
}