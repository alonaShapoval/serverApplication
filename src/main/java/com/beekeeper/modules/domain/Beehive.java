package com.beekeeper.modules.domain;

import javax.persistence.*;

@Entity
@Table(name = "beehive")
public class Beehive {

    @Id
//    @SequenceGenerator(name="seq-gen",sequenceName="MY_SEQ_GEN", initialValue=205, allocationSize=12)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "temp_id")
    private Temperature temperature;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "oxygen_id")
    private Oxygen oxygen;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "amount_id")
    private Amount amount;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "humidity_id")
    private Amount humidity;

    public Beehive(Temperature temperature, Oxygen oxygen, Amount amount, Amount humidity) {
        this.temperature = temperature;
        this.oxygen = oxygen;
        this.amount = amount;
        this.humidity = humidity;
    }

    public Beehive() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public Oxygen getOxygen() {
        return oxygen;
    }

    public void setOxygen(Oxygen oxygen) {
        this.oxygen = oxygen;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public Amount getHumidity() {
        return humidity;
    }

    public void setHumidity(Amount humidity) {
        this.humidity = humidity;
    }
}
