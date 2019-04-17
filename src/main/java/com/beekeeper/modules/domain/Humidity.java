package com.beekeeper.modules.domain;



import javax.persistence.*;
import java.util.Date;

@Entity(name = "humidity")
@Table(name = "humidity")
public class Humidity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date", nullable = false)
    private Date measureDateAmount;

    @Column(name = "value", nullable = false)
    private float humidityValue;

    public Humidity(Date measureDateAmount, float humidityValue) {
        this.measureDateAmount = measureDateAmount;
        this.humidityValue = humidityValue;
    }

    public Humidity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getMeasureDateAmount() {
        return measureDateAmount;
    }

    public void setMeasureDateAmount(Date measureDateAmount) {
        this.measureDateAmount = measureDateAmount;
    }

    public float getHumidityValue() {
        return humidityValue;
    }

    public void setHumidityValue(float humidityValue) {
        this.humidityValue = humidityValue;
    }
}
