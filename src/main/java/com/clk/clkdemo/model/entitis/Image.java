package com.clk.clkdemo.model.entitis;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "image")
public class Image implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private long id;
    private String name;
    private String creation_date;
    private Date createdUser;
    private Date lasModifiedDate;

    @ManyToMany (cascade = CascadeType.ALL)
    @JoinTable(name = "image_minutia", joinColumns = @JoinColumn(name = "image_id"), inverseJoinColumns = @JoinColumn(name = "minutia_id"))
    private Set<Minutia> minutia;

    public Image() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(String creation_date) {
        this.creation_date = creation_date;
    }

    public Set<Minutia> getMinutia() {
        return minutia;
    }

    public Date getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(Date createdUser) {
        this.createdUser = createdUser;
    }

    public Date getLasModifiedDate() {
        return lasModifiedDate;
    }

    public void setLasModifiedDate(Date lasModifiedDate) {
        this.lasModifiedDate = lasModifiedDate;
    }

    public void setMinutia(Set<Minutia> minutia) {
        this.minutia = minutia;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creation_date='" + creation_date + '\'' +
                ", createdUser=" + createdUser +
                ", lasModifiedDate=" + lasModifiedDate +
                ", minutia=" + minutia +
                '}';
    }
}
