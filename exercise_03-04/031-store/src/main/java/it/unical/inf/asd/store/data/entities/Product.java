package it.unical.inf.asd.store.data.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "PRODUCT")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE")
public class Product {

  @Id
  @GeneratedValue
  private Long id;

  @Basic(optional = false)
  @Column(name = "NAME", length = 255)
  private String name;

  @Basic(optional = false)
  @Column(name = "BRAND", length = 255)
  private String brand;

  @Basic(optional = false)
  @Column(name = "BAR_CODE", length = 50, unique = true)
  private String barCode;

  @Column(name = "PRICE")
  private Double price;

  @Lob //large object
  @Basic(optional = false)
  @Column(name = "DESCRIPTION", length = 1024)
  private String description;

  @Column(name = "PHOTO")
  private byte[] photo;

  @OneToOne
  @JoinColumn(name = "CONTAINER_ID", referencedColumnName = "ID")
  private Container container;

  @ManyToMany(mappedBy = "products")
  private List<Customer> customers;

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

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getBarCode() {
    return barCode;
  }

  public void setBarCode(String barCode) {
    this.barCode = barCode;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public byte[] getPhoto() {
    return photo;
  }

  public void setPhoto(byte[] photo) {
    this.photo = photo;
  }

  public Container getContainer() {
    return container;
  }

  public void setContainer(Container container) {
    this.container = container;
  }

  public List<Customer> getCustomers() {
    return customers;
  }

  public void setCustomers(List<Customer> customers) {
    this.customers = customers;
  }
}
