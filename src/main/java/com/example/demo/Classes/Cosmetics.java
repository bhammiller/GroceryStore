package com.example.demo.Classes;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Cosmetics {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;



    @NotNull
    private String cosmeticsname;

    @NotNull
    private String cosmeticsbrand;

    @NotNull
    private Double cosmeticsprice;

    @NotNull
    private String cosmeticspopularity;

    @NotNull
    private Double cosmeticsquantity;

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

    public String getCosmeticsname() {
        return cosmeticsname;
    }

    public void setCosmeticsname(String cosmeticsname) {
        this.cosmeticsname = cosmeticsname;
    }

    public String getCosmeticsbrand() {
        return cosmeticsbrand;
    }

    public void setCosmeticsbrand(String cosmeticsbrand) {
        this.cosmeticsbrand = cosmeticsbrand;
    }

    public Double getCosmeticsprice() {
        return cosmeticsprice;
    }

    public void setCosmeticsprice(Double cosmeticsprice) {
        this.cosmeticsprice = cosmeticsprice;
    }

    public String getCosmeticspopularity() {
        return cosmeticspopularity;
    }

    public void setCosmeticspopularity(String cosmeticspopularity) {
        this.cosmeticspopularity = cosmeticspopularity;
    }

    public Double getCosmeticsquantity() {
        return cosmeticsquantity;
    }

    public void setCosmeticsquantity(Double cosmeticsquantity) {
        this.cosmeticsquantity = cosmeticsquantity;
    }
}
