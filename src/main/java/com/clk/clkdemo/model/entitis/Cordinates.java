package com.clk.clkdemo.model.entitis;

import javax.persistence.*;

@Entity
@Table(name = "cordinates")
public class Cordinates {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int x;
    private int y;
    private int x1;
    private int y1;

    @ManyToOne
    @JoinColumn(name = "minutia_id")
    private Minutia minutia;


    public Cordinates() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public Minutia getMinutia() {
        return minutia;
    }

    public void setMinutia(Minutia minutia) {
        this.minutia = minutia;
    }
}
