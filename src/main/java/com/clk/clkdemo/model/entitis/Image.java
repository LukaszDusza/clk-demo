package com.clk.clkdemo.model.entitis;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "image")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private long id;
    private String name;
    private String creation_date;
    private Date createdUser;
    private Date lasModifiedDate;

    @OneToMany
    private List<Minutia> minutia;

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

    public List<Minutia> getMinutia() {
        return minutia;
    }

    public void setMinutia(List<Minutia> minutia) {
        this.minutia = minutia;
    }
}
