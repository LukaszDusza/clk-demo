package com.clk.clkdemo.model.entitis;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "minucja")
public class Minucja {

    private Long id;
    private String name;
    private String type;
    private String describe;
    private String colour;

    public Minucja(Long id, String name, String type, String describe, String colour) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.describe = describe;
        this.colour = colour;
    }

    public Minucja() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
