package com.beekeeper.modules.domain;



import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "temperature")
public class Temperature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date", nullable = false)
    private Date measureDateTemperature;

    @Column(name = "value", nullable = false)
    private Float temperatureValue;

    public Temperature(Date measureDateTemperature, Float temperatureValue) {
        this.measureDateTemperature = measureDateTemperature;
        this.temperatureValue = temperatureValue;
    }

    public Temperature() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getMeasureDateTemperature() {
        return measureDateTemperature;
    }

    public void setMeasureDateTemperature(Date measureDateTemperature) {
        this.measureDateTemperature = measureDateTemperature;
    }

    public Float getTemperatureValue() {
        return temperatureValue;
    }

    public void setTemperatureValue(Float temperatureValue) {
        this.temperatureValue = temperatureValue;
    }
}
