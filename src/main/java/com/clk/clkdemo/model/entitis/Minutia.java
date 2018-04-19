package com.clk.clkdemo.model.entitis;

import javax.persistence.*;

@Entity
@Table(name = "minutia")
public class Minutia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "minutia_id")
    private long id;
    private String name;
    private String divId;
    private String color;
    private int posX;
    private int posy;
    private int posX1;
    private int posy1;
    private String description;
    private int sectorOnDroped;
    private int scoopeValue;

    public Minutia() {
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

    public String getDivId() {
        return divId;
    }

    public void setDivId(String divId) {
        this.divId = divId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public int getPosX1() {
        return posX1;
    }

    public void setPosX1(int posX1) {
        this.posX1 = posX1;
    }

    public int getPosy1() {
        return posy1;
    }

    public void setPosy1(int posy1) {
        this.posy1 = posy1;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSectorOnDroped() {
        return sectorOnDroped;
    }

    public void setSectorOnDroped(int sectorOnDroped) {
        this.sectorOnDroped = sectorOnDroped;
    }

    public int getScoopeValue() {
        return scoopeValue;
    }

    public void setScoopeValue(int scoopeValue) {
        this.scoopeValue = scoopeValue;
    }

    @Override
    public String toString() {
        return "Minutia{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", divId='" + divId + '\'' +
                ", color='" + color + '\'' +
                ", posX=" + posX +
                ", posy=" + posy +
                ", posX1=" + posX1 +
                ", posy1=" + posy1 +
                ", description='" + description + '\'' +
                ", sectorOnDroped=" + sectorOnDroped +
                ", scoopeValue=" + scoopeValue +
                '}';
    }
}
