package com.beekeeper.modules.domain;



import javax.persistence.*;

@Entity
@Table(name = "current_beehive")
public class CurrentBeehive {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "swarming")
    private Boolean swarming;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "beehive_id")
    private Beehive beehive;

    public CurrentBeehive(Boolean swarming, User user, Beehive beehive) {
        this.swarming = swarming;
        this.user = user;
        this.beehive = beehive;
    }

    public CurrentBeehive() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getSwarming() {
        return swarming;
    }

    public void setSwarming(Boolean swarming) {
        this.swarming = swarming;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Beehive getBeehive() {
        return beehive;
    }

    public void setBeehive(Beehive beehive) {
        this.beehive = beehive;
    }
}
