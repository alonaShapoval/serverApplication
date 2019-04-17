package com.beekeeper.modules.domain;




import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "amount")
public class Amount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date", nullable = false)
    private Date measureDateAmount;

    @Column(name = "value", nullable = false)
    private Long amountOfBees;

    public Amount(Date measureDateAmount, Long amountOfBees) {
        this.measureDateAmount = measureDateAmount;
        this.amountOfBees = amountOfBees;
    }

    public Amount() {
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

    public Long getAmountOfBees() {
        return amountOfBees;
    }

    public void setAmountOfBees(Long amountOfBees) {
        this.amountOfBees = amountOfBees;
    }
}
