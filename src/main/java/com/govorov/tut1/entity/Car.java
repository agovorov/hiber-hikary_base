package com.govorov.tut1.entity;

import javax.persistence.*;

/**
 * @author Govorov Andrey
 */
@Entity
@Table(name = "CAR")
public class Car extends Base {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "MODEL", nullable = false)
    private String model;

    @Column(name = "VENDOR", nullable = false)
    private String Vendor;

    @Column(name = "YEAR", nullable = false)
    private int year;

    @Column(name = "PRICE", nullable = false)
    private int price;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "owner", insertable = false, updatable = false)
    private User owner;

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVendor() {
        return Vendor;
    }

    public void setVendor(String vendor) {
        Vendor = vendor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", Vendor='" + Vendor + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", owner=" + owner +
                '}';
    }
}
