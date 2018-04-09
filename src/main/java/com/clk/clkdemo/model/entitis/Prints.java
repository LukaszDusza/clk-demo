package com.clk.clkdemo.model.entitis;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "prints")
public class Prints {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String picture;
    private String creation_date;
    private String createdUser;
    private String user;
    private String minutia;
    private String updateDate;

    @OneToMany
    private List<Cordinates> cordinates;

    public Prints() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(String creation_date) {
        this.creation_date = creation_date;
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMinutia() {
        return minutia;
    }

    public void setMinutia(String minutia) {
        this.minutia = minutia;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public List<Cordinates> getCordinates() {
        return cordinates;
    }

    public void setCordinates(List<Cordinates> cordinates) {
        this.cordinates = cordinates;
    }
}
