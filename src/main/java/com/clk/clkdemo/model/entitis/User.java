package com.clk.clkdemo.model.entitis;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "user")
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long id;
    private String name;
    private String password;
    private String rola;
    private Date userSign;
    private Date lastActivity;

    @ManyToMany (cascade = CascadeType.ALL)
    @JoinTable(name = "user_image", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "image_id"))
    private Set<Image> images;

    public User() {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRola() {
        return rola;
    }

    public void setRola(String rola) {
        this.rola = rola;
    }

    public Date getUserSign() {
        return userSign;
    }

    public void setUserSign(Date userSign) {
        this.userSign = userSign;
    }

    public Date getLastActivity() {
        return lastActivity;
    }

    public void setLastActivity(Date lastActivity) {
        this.lastActivity = lastActivity;
    }

    public Set<Image> getImages() {
        return images;
    }

    public void setImages(Set<Image> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", rola='" + rola + '\'' +
                ", userSign=" + userSign +
                ", lastActivity=" + lastActivity +
                ", images=" + images +
                '}';
    }
}
