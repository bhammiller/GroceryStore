package com.example.demo.Classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Snacks {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String snackname;

    @NotNull
    private String snackcrunchiness;

    @NotNull
    private Double snackprice;

    @NotNull
    private Double snackquantity;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSnackname() {
        return snackname;
    }

    public void setSnackname(String snackname) {
        this.snackname = snackname;
    }

    public String getSnackcrunchiness() {
        return snackcrunchiness;
    }

    public void setSnackcrunchiness(String snackcrunchiness) {
        this.snackcrunchiness = snackcrunchiness;
    }

    public Double getSnackprice() {
        return snackprice;
    }

    public void setSnackprice(Double snackprice) {
        this.snackprice = snackprice;
    }

    public Double getSnackquantity() {
        return snackquantity;
    }

    public void setSnackquantity(Double snackquantity) {
        this.snackquantity = snackquantity;
    }
}
