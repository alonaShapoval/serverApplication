package com.beekeeper.modules.domain;




import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "oxygen")
public class Oxygen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date", nullable = false)
    private Date measureDateOxygen;

    @Column(name = "value", nullable = false)
    private Float oxygenValue;

    public Oxygen(Date measureDateOxygen, Float oxygenValue) {
        this.measureDateOxygen = measureDateOxygen;
        this.oxygenValue = oxygenValue;
    }

    public Oxygen() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getMeasureDateOxygen() {
        return measureDateOxygen;
    }

    public void setMeasureDateOxygen(Date measureDateOxygen) {
        this.measureDateOxygen = measureDateOxygen;
    }

    public Float getOxygenValue() {
        return oxygenValue;
    }

    public void setOxygenValue(Float oxygenValue) {
        this.oxygenValue = oxygenValue;
    }
}
