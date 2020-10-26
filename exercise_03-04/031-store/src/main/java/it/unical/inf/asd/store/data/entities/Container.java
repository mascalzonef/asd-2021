package it.unical.inf.asd.store.data.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CONTAINER")
public class Container {

  @Id
  @GeneratedValue
  private Long id;

  @Basic(optional = false)
  @Column(name = "NAME", length = 255, unique = true)
  private String name;

  @Column(name = "COLOR", length = 255)
  private String color;

  @OneToOne(mappedBy = "container")
  private Product product;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }
}
