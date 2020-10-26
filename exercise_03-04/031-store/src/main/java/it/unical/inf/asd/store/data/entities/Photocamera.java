package it.unical.inf.asd.store.data.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("P")
class Photocamera extends Product {

  @Column(name="SENSOR_SIZE")
  private String sensorSize;

  public String getSensorSize() {
    return sensorSize;
  }

  public void setSensorSize(String sensorSize) {
    this.sensorSize = sensorSize;
  }
}
