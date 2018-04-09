package com.clk.clkdemo.model.entitis;

import javax.persistence.*;

@Entity
@Table(name = "minutia")
public class Minutia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String name;
    private String type;
    private String colour;
    private String text;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
