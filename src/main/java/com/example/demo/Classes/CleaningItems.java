package com.example.demo.Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class CleaningItems {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String cleaningname;

    @NotNull
    private String cleaningstrength;

    @NotNull
    private Double cleaningprice;

    @NotNull
    private Double cleaningquantities;

    private Double totalprice;

    private Double pricesum;

    public Double getPricesum() { return pricesum; }

    public void setPricesum(Double pricesum) { this.pricesum = pricesum; }

    public Double getTotalprice() { return totalprice; }

    public void setTotalprice(Double totalprice) { this.totalprice = totalprice; }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCleaningname() {
        return cleaningname;
    }

    public void setCleaningname(String cleaningname) {
        this.cleaningname = cleaningname;
    }

    public String getCleaningstrength() {
        return cleaningstrength;
    }

    public void setCleaningstrength(String cleaningstrength) {
        this.cleaningstrength = cleaningstrength;
    }

    public Double getCleaningprice() {
        return cleaningprice;
    }

    public void setCleaningprice(Double cleaningprice) {
        this.cleaningprice = cleaningprice;
    }

    public Double getCleaningquantities() {
        return cleaningquantities;
    }

    public void setCleaningquantities(Double cleaningquantities) {
        this.cleaningquantities = cleaningquantities;
    }
}
